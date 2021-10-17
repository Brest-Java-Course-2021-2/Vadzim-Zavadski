package com.epam.brest.calc;

import com.epam.brest.calc.CalcImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Properties;
import java.util.Scanner;

public class MainConfigAndCons {
    public static void main(String[] args) {

        BigDecimal weight, pricePerKg, length, pricePerKm;

        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("src/main/resources/config.properties");
            prop.load(input);
            Scanner scanner = new Scanner(System.in);
            weight = getValueFromCon(scanner, "Enter weight:");
            if (weight.doubleValue() < 20) {
                pricePerKg = getValueFromProp(prop, "pricePerKg1");
            } else {
                pricePerKg = getValueFromProp(prop, "pricePerKg2");
            }
            length = getValueFromCon(scanner, "Enter length:");
            if (length.doubleValue() < 100) {
                pricePerKm = getValueFromProp(prop, "pricePerKm1");
            } else {
                pricePerKm = getValueFromProp(prop, "pricePerKm2");
            }
            System.out.println("Result: " + new CalcImpl().handle(weight, pricePerKg, length, pricePerKm));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private static BigDecimal getValueFromProp(Properties prop, String s) {
        BigDecimal valueFromProp;
        valueFromProp = BigDecimal.valueOf(Double.parseDouble(prop.getProperty(s)));
        System.out.println(s + " = " + valueFromProp);
        return valueFromProp;
    }
    private static BigDecimal getValueFromCon(Scanner scanner, String outputMessage) {
        BigDecimal enteredValue;
        System.out.print(outputMessage);
        enteredValue = scanner.nextBigDecimal();
        return enteredValue;
    }
}
