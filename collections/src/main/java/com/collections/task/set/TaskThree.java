package com.collections.task.set;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;




// Create a set containing the colours of the rainbow and:
//     Display all the colours one below the other.
//     Show the number of colours in the rainbow.
//     Display the colours in alphabetical order.
//     Display the colours in the reverse order of how they were provided.
//     Show all colours that start with the letter "v".
//     Remove all colours that do not start with the letter "v".
//     Clear the set.
//     Check if the set is empty.


public class TaskThree {
    public static void main(String[] args) {
        
        Set<Rainbow> rainbowColours = new LinkedHashSet<>(){{
            add(new Rainbow("Red"));
            add(new Rainbow("Orange"));
            add(new Rainbow("Yellow"));
            add(new Rainbow("Green"));
            add(new Rainbow("Blue"));
            add(new Rainbow("Indigo"));
            add(new Rainbow("Violet"));
        }};
        
        System.out.println("Display all the colours one below the other.");
        for (Rainbow rainbow : rainbowColours) {
            System.out.println(rainbow.getColour());
        }

        System.out.println("\nShow the number of colours in the rainbow: " + rainbowColours.size());

        System.out.println("\nDisplay the colours in alphabetical order.");
        Set<Rainbow> rainbowColoursTwo = new TreeSet<>(rainbowColours);
        for (Rainbow rainbow : rainbowColoursTwo) {
            System.out.println(rainbow.getColour());
        }


        List<Rainbow> reverseColour = new ArrayList<>(rainbowColoursTwo);
        Collections.reverse(reverseColour);

        System.out.println("\nDisplay the colours in the reverse order of how they were provided.");
        for (Rainbow rainbow : reverseColour) {
            System.out.println(rainbow.getColour());
        }

        System.out.println("Show all colours that start with the letter 'v'.");
        for (Rainbow rainbow : rainbowColoursTwo) {
            if (rainbow.startWith("V"))
                System.out.println(rainbow.toString());
        }

        System.out.println("Remove all colours that do not start with the letter 'v'.");
        Iterator<Rainbow> iterator = rainbowColours.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startWith("V"))
                iterator.remove();
        }
        System.out.println(rainbowColours.toString());

        System.out.println("Clear the set.");
        rainbowColours.clear();
        rainbowColoursTwo.clear();
        System.out.println(rainbowColours);

        System.out.println("Check if the set is empty: "+ rainbowColours.isEmpty());
    }

    
    
}
