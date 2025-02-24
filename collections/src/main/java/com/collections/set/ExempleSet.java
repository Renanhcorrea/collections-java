package com.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExempleSet {
    public static void main(String[] args) {
        
        // System.out.println("Create a set and add the grades: ");
        // Set<Double> notas = new HashSet<>();
        // notas.add(7.0);
        // notas.add(8.5);
        // notas.add(9.3);
        // notas.add(5.0);
        // notas.add(7.0);
        // notas.add(0.0);
        // notas.add(3.6);

        // Iterator<Double> it = notas.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        
        // System.out.println("Check if the grade 5 is in the set: "+ notas.contains(5d)); 
        
        // System.out.println("Show the lowest grade in the set: " + Collections.min(notas));
        // System.out.println("Show the highest grade in the set: " + Collections.max(notas));
        
        // Iterator<Double> iterator = notas.iterator();
        // Double sum = 0.0;
        // while (iterator.hasNext()) { 
        //     Double next = iterator.next();
        //     sum += next;    
        // }
        // System.out.printf("Show the sum of the values: %.2f", sum);

        // System.out.printf("%nShow the average of the values: %.2f", (sum/notas.size()));


        // System.out.println("\nRemove the number 0: " + notas.remove(0.0));
        // System.out.println(notas);

        // System.out.println("Remove all");

        // Iterator<Double> remover = notas.iterator();
        // while (remover.hasNext()){
        //     Double next = remover.next();
        //     if(next < 7) 
        //         remover.remove();
        // }
        // System.out.println(notas);

        System.out.println("Create a set and add the grades: ");
        Set<Double> note2 = new LinkedHashSet<>();
        note2.add(7.0);
        note2.add(8.5);
        note2.add(9.3);
        note2.add(5.0);
        note2.add(7.0);
        note2.add(0.0);
        note2.add(3.6);

        System.out.println(note2.size());
        Set<Double> note3 = new TreeSet<>(note2);
        System.out.println("Show the ascending order");
        System.out.println(note3);

        note2.clear();

        System.out.println(note2.isEmpty());
        System.out.println(note3.isEmpty());

    }

}
