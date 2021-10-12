package com.epam.brest;

import com.epam.brest.calc.CalcImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Properties;

public class MainConfig {
    public static void main(String[] args) {

        BigDecimal weight, pricePerKg, length, pricePerKm;

        Properties prop = new Properties();
        InputStream input;

        try {
            input = new FileInputStream("src/main/resources/config.properties");
            prop.load(input);
        } catch (IOException ex) {
            System.out.println("d " + ex);
        }

        weight = getValueFromProp(prop, "weight");
        pricePerKg = getValueFromProp(prop, "pricePerKg");
        length = getValueFromProp(prop, "length");
        pricePerKm = getValueFromProp(prop, "pricePerKm");

        System.out.println("Result: " + new CalcImpl().handle(weight, pricePerKg, length, pricePerKm));
    }

    private static BigDecimal getValueFromProp(Properties prop, String s) {
        BigDecimal valueFromProp;
        valueFromProp = BigDecimal.valueOf(Double.parseDouble(prop.getProperty(s)));
        System.out.println(s + " = " + valueFromProp);
        return valueFromProp;
    }
}
