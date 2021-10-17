package com.epam.brest;

import com.epam.brest.model.ReadData;
import com.epam.brest.model.Status;
import com.epam.brest.model.StatusType;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        //result = weight*pricePerKg + km*pricePerKm;

        //TODO read from file
        //pricePerKg = getValueFromCon(scanner, "Enter pricePerKg:");
        //pricePerKm = getValueFromCon(scanner, "Enter pricePerKm:");

        try (Scanner scanner = new Scanner(System.in)) {
            Status currentStatus = new ReadData(scanner);
            while (currentStatus.getType() != StatusType.EXIT) {
                System.out.println("current type: " + currentStatus.getType());
                currentStatus = currentStatus.handle();
            }
        }
    }

}