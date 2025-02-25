package com.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingMap {
    public static void main(String[] args) {
        
        Map<String, BookMap> myBook = new HashMap<>(){{
             put(" Howking, Stephen", new BookMap("Uma breve historia do tempo", 256));
             put(" Duhigg, Charles", new BookMap("O poder do Habito", 408));
             put(" Harari, Yuval Noah", new BookMap("O poder do Habito", 408));
        }};

        System.out.println("\nRandom order.");
        for (Map.Entry<String, BookMap> book : myBook.entrySet()){
            System.out.println(book.getKey() + " - " + book.getValue().getname());
        }

        System.out.println("\nNormal Order.");
        Map<String, BookMap> mybookLinked = new LinkedHashMap<>(){{
            put(" Howking, Stephen", new BookMap("Uma breve historia do tempo", 256));
            put(" Duhigg, Charles", new BookMap("O poder do Habito", 408));
            put(" Harari, Yuval Noah", new BookMap("O poder do Habito", 408));      
        }};
        for (Map.Entry<String, BookMap> bookOne : mybookLinked.entrySet()) {
            System.out.println("Author: " + bookOne.getKey() + " - Book Name: " + bookOne.getValue().getname() + " - Page: " + bookOne.getValue().getPage());
        }

        Map<String, BookMap> myBookTreeMap = new TreeMap<>(mybookLinked);
        System.out.println("\nAlphabetical order of authors.");
        for (Map.Entry<String, BookMap> bookTwo : myBookTreeMap.entrySet()){
            System.out.println("Author: " + bookTwo.getKey() + " - Book Name: " + bookTwo.getValue().getname() + " - Page: " + bookTwo.getValue().getPage());
        }

        System.out.println("\nAlphabetical order of book titles.");
        Set<Map.Entry<String, BookMap>> myBookTreeSet = new TreeSet<>(new SortingBookTitle());
        myBookTreeSet.addAll(mybookLinked.entrySet());
        for (Map.Entry<String, BookMap> bookThree : myBookTreeSet){
            System.out.println("Author: " + bookThree.getKey() + " - Book Name: " + bookThree.getValue().getname() + " - Page: " + bookThree.getValue().getPage());
        }


        System.out.println("\nOrder by number of pages.");
        Set<Map.Entry<String, BookMap>> myBookTreeSetTwo = new TreeSet<>(new SortingBookPage());
        myBookTreeSetTwo.addAll(mybookLinked.entrySet());
        for (Map.Entry<String, BookMap> bookFour : myBookTreeSetTwo){
            System.out.println("Author: " + bookFour.getKey() + " - Book Name: " + bookFour.getValue().getname() + " - Page: " + bookFour.getValue().getPage());
        }





    }
}
