package com.collections.task.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Create a program that receives the average temperature for the first six months of the year and stores them in a list
    
// After that, calculate the six-month average temperature and display all temperatures above this average, along with the month in which they occurred (show the month in full: 1- January, 2 - February, etc.).

public class Temperature {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);   
        List<Double> temperature = new ArrayList<>();

        int count = 0;

        while(true){
            if (count == 6) break;

            System.out.println("Temperature: ");
            Double temp = scanner.nextDouble();
            temperature.add(temp);
            count++;
        }

        System.out.println("---------------");
        for (Double t : temperature) {
            System.out.println(t + "C");
        }
    
        System.out.println("---- Average Temperature ----");
        double sum = 0;
        for (double temp : temperature) {
            sum += temp;
        }
        double average = temperature.isEmpty() ? 0.0 : sum / temperature.size();
        System.out.println(average);

        System.out.println("---- Temperatures Above Average ----");
        Iterator<Double> it = temperature.iterator();

        count = 0;
        while (it.hasNext()) {
            Double i = it.next();
            if(i>average){
                // switch (count) {
                //     case (1) :
                //         System.out.println("1 - January: " + i);
                //         break;
                //     case (2) :
                //         System.out.println("2 - February: " + i);
                //         break;
                //     case (3) :
                //         System.out.println("3 - March: " + i);
                //         break;
                //     case (4) :
                //         System.out.println("4 - April: " + i);
                //         break;
                //     case (5) :
                //         System.out.println("5 - May: " + i);
                //         break;
                //     case (6) :
                //         System.out.println("6 - June: " + i);
                //         break;
                //     default:
                //         System.out.println("Error");
                switch (count) {
                    case (1) -> System.out.println("1 - January: " + i);
                    case (2) -> System.out.println("2 - February: " + i);
                    case (3) -> System.out.println("3 - March: " + i);
                    case (4) -> System.out.println("4 - April: " + i);
                    case (5) -> System.out.println("5 - May: " + i);
                    case (6) -> System.out.println("6 - June: " + i);
                    default -> System.out.println("Error");
                }
            }
            count++;
        }
    }    
}
