package com.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExempleMap {
    public static void main(String[] args) {
        System.out.println("Create a dictionary that maps the models to their respective ones.");
        Map<String, Double> popularCars = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(popularCars.toString());

        System.out.println("Replace the fuel consumption of the Gol with 15.2 km/L");
        popularCars.put("Gol", 15.2); // for change the value, is just to say the same key.

        System.out.println("Check if the Tucson model is in the dictionary: " + popularCars.containsKey("Tucson"));

        System.out.println("Display the models: " + popularCars.keySet());
        // Set<String> modelos = popularCars.keySet(); 
        // System.out.println(modelos);

        System.out.println("Display the fuel consumption of the cars: " + popularCars.values());
        // Collection<Double> values = popularCars.values();
        // System.out.println(values);

        // System.out.println("Display the most economical model and its fuel consumption.");
        Double efficientConsumption = Collections.max(popularCars.values());
        Set<Map.Entry<String, Double>> entries = popularCars.entrySet();
        String efficientModels = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(efficientConsumption)){
                efficientModels = entry.getKey();
                System.out.println("Efficient models: " + efficientModels + " - " + efficientConsumption + "Km/L");
            }
        }

        System.out.println("Display the model that consumes the most, its model, and its fuel consumption.");
        Double inefficientConsumption = Collections.min(popularCars.values());
        String inefficientModel = "";

        for (Map.Entry<String, Double> entry : popularCars.entrySet()){
            if (entry.getValue().equals(inefficientConsumption)) {
                inefficientModel = entry.getKey();
                System.out.println("Inefficient model: " + inefficientModel + " - " + inefficientConsumption +"Km/L");
            }
        }

        System.out.println("Display the sum of the fuel consumptions.");
        Iterator<Double> iterator = popularCars.values().iterator();
        Double sum = 0.0;
        while (iterator.hasNext()) {
            sum += iterator.next();         
        }
        System.out.println(sum);

        System.out.println("Display the average fuel consumption of this car dictionary: " + (sum/popularCars.size()));

        System.out.println("Remove the models with a consumption of 15.6 km/L.");
        Iterator<Double> iterator1 = popularCars.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) 
                iterator1.remove();
        }
        System.out.println(popularCars);
        Map<String, Double> popularCars1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(popularCars1.toString());

        System.out.println("Display the dictionary sorted by the model: ");
        Map<String, Double> popularCars2 = new TreeMap<>(popularCars1);
        System.out.println(popularCars2);

        System.out.println("Delete the car dictionary.");
        popularCars.clear();
        popularCars1.clear();
        popularCars2.clear();

        System.out.println("Check if the dictionary is empty: " +popularCars.isEmpty());
        System.out.println("Check if the dictionary is empty: " +popularCars1.isEmpty());
        System.out.println("Check if the dictionary is empty: " +popularCars2.isEmpty());
    }
}   

