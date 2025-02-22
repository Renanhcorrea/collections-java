package com.collections.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Given the following information about my cats, create a list and sort it, displaying: (Name, Age, Colour)

// Gato1 = name: Jon, age: 18, colour: black
// Gato2 = name: Simba, age: 6, colour: brindle
// Gato3 = name: Jon, age: 12, colour: yellow

public class Main {
    public static void main(String[] args) {
        
        List<Gato> cat = new ArrayList<>();
        cat.add(new Gato("Jon", 18, "black"));
        cat.add(new Gato("Simba", 6, "brindle"));
        cat.add(new Gato("Jon", 12, "yellow"));
        
        System.out.println("\n--\tInsertion Order\t--");
        System.out.println(cat);
        
        System.out.println("\n--\tRandom Order\t--");
        Collections.shuffle(cat);
        System.out.println(cat);

        System.out.println("\n--\tNatural Order (name)\t--");
        Collections.sort(cat);
        System.out.println(cat);
     
        System.out.println("\n--\tNatural Order (age)\t--");
        Collections.sort(cat, new ComparadorIdade());
        System.out.println(cat);
        
        System.out.println("\n--\tNatural Order (colour)\t--");
        Collections.sort(cat, new CompradorCor());
        System.out.println(cat);
        
        System.out.println("\n--\tOrder Name/Colour/Age\t--");
        Collections.sort(cat, new ComparadorNomeCorIdade());
        System.out.println(cat);

    }
}
