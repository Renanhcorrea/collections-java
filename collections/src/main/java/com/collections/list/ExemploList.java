package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        //List of seven scores from one student: [7, 8.5, 9.3, 5, 7, 0, 3.6]. Perform the following actions:

        System.out.println("Need to create a list and add the seven scores: ");
        List<Double> notas = new ArrayList<>(); // Generics
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);
        //System.out.println(notas.toString());
        System.out.println(notas.indexOf(5d));
        
        notas.add(4, 8.0); //Right position
        System.out.println(notas);
        
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);
        
        System.out.println(notas.contains(6.0));

        for (double nota : notas) 
            System.out.println(nota);
    }

}
