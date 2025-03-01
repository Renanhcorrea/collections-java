package com.collections.task.map;

// Given the estimated population of some states in the Brazilian Northeast, do the following:
//     State: PE - Population: 9,616.621
//     State: AL - Population: 3,351.543
//     State: CE - Population: 9,187.103
//     State: RN - Population: 3,534.265
// 1) Create a dictionary and map the states to their populations.
// 2) Replace the population of the state of RN with 3,534.165.
// 3) Check if the state PB is in the dictionary; if not, add: PB - 4,039.277.
// 4) Display the population of PE.
// 5) Display all states and their populations in the order they were provided.
// 6) Display the states and their populations in alphabetical order.
// 7) Display the state with the smallest population and its quantity.
// 8) Display the state with the largest population and its quantity.
// 9) Display the sum of the population of these states.
// 10) Display the average population of this dictionary of states.
// 11) Remove the states with a population lower than 4,000.000.
// 12) Delete the states dictionary.
// 13) Confirm if the dictionary is empty.







import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;





public class TaskMap {   
    public static void main(String[] args) {
        Map<String, StatePopulation> brazilianStates = new HashMap<>(){{
            put("Pernambuco", new StatePopulation("PE", 9616621));
            put("Alagoas", new StatePopulation("AL", 3351543));
            put("Ceara", new StatePopulation("CE", 9187103));
            put("Rio Grande do Norte", new StatePopulation("RN", 3534265));
        }};
        for (Map.Entry<String, StatePopulation> states : brazilianStates.entrySet()) {
            System.out.println(states.getValue().getName() + " - " + states.getValue().getPopulation() );
        }
        
        // Requested 02
        System.out.println("\nReplace the population of the state of RN with 3,534.165.");
        brazilianStates.replace("Rio Grande do Norte", new StatePopulation("RN", 3534165));
        for (Map.Entry<String, StatePopulation> states : brazilianStates.entrySet()){
            System.out.println(states.getValue().getName() + " - " + states.getValue().getPopulation());
        }

        // Requested 03
        System.out.println("\nCheck if the state PB is in the dictionary; if not, add: PB - 4,039.277.");

        // --- Refactor --- 
        // if (brazilianStates.containsValue("PB")){
        //     for (Map.Entry<String, StatePopulation> states : brazilianStates.entrySet()){
        //         System.out.println(states.getValue().getName() + " - " + states.getValue().getPopulation());
        //     } 
        // } else { 
        //     brazilianStates.put("Paraiba", new StatePopulation("PB", 4039277));
        //     for (Map.Entry<String, StatePopulation> states : brazilianStates.entrySet()){
            //         System.out.println(states.getValue().getName() + " - " + states.getValue().getPopulation());
            //     }
            // }   
        if(!brazilianStates.containsKey("PB")){
                brazilianStates.put("Paraiba", new StatePopulation("PB", 4039277));
        }
        for (Map.Entry<String, StatePopulation> states : brazilianStates.entrySet()){
                System.out.println(states.getValue().getName() + " - " + states.getValue().getPopulation());
        }

        // Requested 04
        System.out.println("\nDisplay the population of PE.\nPopulation: " + brazilianStates.get("Pernambuco").getPopulation());


        // Requested 05 
        System.out.println("\nDisplay all states and their populations in the order they were provided.");
        Map<String, StatePopulation> brazilianStatesLinked = new LinkedHashMap<>(){{
            put("Pernambuco", new StatePopulation("PE", 9616621));
            put("Alagoas", new StatePopulation("AL", 3351543));
            put("Ceara", new StatePopulation("CE", 9187103));
            put("Rio Grande do Norte", new StatePopulation("RN", 3534165));
            put("Paraiba", new StatePopulation("PB", 4039277));
        }};
        for (Map.Entry<String, StatePopulation> states : brazilianStatesLinked.entrySet()){
            System.out.println(states.getValue().getName() + " - " + states.getValue().getPopulation());
        }

        // Requested 06
        System.out.println("\nDisplay the states and their populations in alphabetical order.");
        Map<String, StatePopulation> brazilianStatesTree = new TreeMap<>(brazilianStatesLinked);
        for (Map.Entry<String, StatePopulation> states : brazilianStatesTree.entrySet()){
            System.out.println(states.getValue().getName() + " - " + states.getValue().getPopulation());
        }

        // Requested 07
        System.out.println("\nDisplay the state with the smallest population and its quantity.");
        StatePopulation minPopulation = Collections.min(brazilianStates.values());
        StatePopulation maxPopulation = Collections.max(brazilianStates.values());
        String minState = "";
        String maxState = "";

        for (Map.Entry<String, StatePopulation> entry : brazilianStates.entrySet()) {
            if (entry.getValue().equals(maxState)) {
                maxState = entry.getValue().getName();
            }
            if (entry.getValue().equals(minState)) {
                minState = entry.getValue().getName();
            }
        }
        System.out.println(minState + minPopulation);

        // Requesetd 08
        System.out.println("\nDisplay the state with the largest population and its quantity.");
        System.out.println(maxState + maxPopulation);

        // Requested 09
        System.out.println("\nDisplay the sum of the population of these states.");



        // Requested 10
        System.out.println("\nDisplay the average population of this dictionary of states.");



        // Requested 11 
        System.out.println("\nRemove the states with a population lower than 4,000.000.");



        // Requested 12
        System.out.println("\nDelete the states dictionary.");



        // Requested 13
        System.out.println("\nConfirm if the dictionary is empty.");

        

    }
}
