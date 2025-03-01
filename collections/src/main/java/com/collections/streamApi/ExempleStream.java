package com.collections.streamApi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExempleStream {
    public static void main(String[] args) {
        
        System.out.println("Order");
        Map<Integer, Contact> myContact = new HashMap<>(){{
            put(1, new Contact("Simba", 5555));
            put(4, new Contact("Cami", 1111));
            put(3, new Contact("Jon", 2222));
        }};
        for (Map.Entry<Integer, Contact> entry : myContact.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println("Order of insertion");
        Map<Integer, Contact> myContactTwo = new LinkedHashMap<>(){{
            put(1, new Contact("Simba", 5555));
            put(4, new Contact("Cami", 1111));
            put(3, new Contact("Jon", 2222));
        }};
        for (Map.Entry<Integer, Contact> entry : myContactTwo.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println("ID Order");
        Map<Integer, Contact> myContactThree = new TreeMap<>(myContactTwo);
        for (Map.Entry<Integer, Contact> entry: myContactThree.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }
/*
        // Classe anonima
        Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contact>>(){
            
            @Override
            public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2){
                return Integer.compare(cont1.getValue().getNumber(), cont2.getValue().getNumber());
            }
        });
        set.addAll(myContact.entrySet());
        System.out.println("By Number");
        for (Map.Entry<Integer, Contact> entry : set){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() + " - " + entry.getValue().getName());
        }
*/

/*
        // Method Static
        Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(Comparator.comparing(
            new Function<Map.Entry<Integer, Contact>, Integer>() {
                @Override
                public Integer apply(Map.Entry<Integer, Contact> t) {
                    return t.getValue().getNumber();
                }
        }));
        set.addAll(myContact.entrySet());
        System.out.println("By Number");
        for (Map.Entry<Integer, Contact> entry : set){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() + " - " + entry.getValue().getName());
        }
*/


        // Lambda
        Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(Comparator.comparing(t -> t.getValue().getNumber()));

        set.addAll(myContact.entrySet());
        System.out.println("By Number");
        for (Map.Entry<Integer, Contact> entry : set){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() + " - " + entry.getValue().getName());
        }


    }
}
