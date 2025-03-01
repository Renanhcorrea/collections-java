package com.collections.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        
        List<String> numbers = Arrays.asList("1", "0", "5", "10", "11", "16", "20");
        
        // System.out.println("----");
        // System.out.println("First Stream()");
        // numbers.stream().forEach(new Consumer<String>() {
        //     @Override
        //     public void accept(String s){
        //         System.out.println(s);
        //     }
        // });
        
        // System.out.println("\nSecond Stream()");
        // numbers.stream().forEach(s -> System.out.println(s));
        
        // System.out.println("\nThird Stream() ");
        // numbers.stream().forEach(System.out::println);


        // System.out.println("The 5 first number and put it inside the Set");
        // numbers.stream()
        //     .limit(5)
        //     .collect(Collectors.toSet())
        //     .forEach(System.out::println);
        

        // System.out.println("\nChange the list from String to Int");
        // numbers.stream()
        //     .map(Integer::parseInt) // .map(t -> Integer.parseInt(t)); 
        //     .collect(Collectors.toList())
        //     .forEach(System.out::println);

        // System.out.println("\nTake the numbers above 2 and even numbers.");
        // numbers.stream()
        //     .map(Integer::parseInt)
        //     .filter(i -> i %2 == 0 && i>2)
        //     .collect(Collectors.toList())
        //     .forEach(System.out::println);

        // System.out.println("\nAvarage of the numbers.");
        // numbers.stream()
        //     .mapToInt(Integer::parseInt)
        //     .average()
        //     .ifPresent(System.out::println);
            
        List<Integer> numbersInteger = numbers.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());


        System.out.println(numbersInteger.size());
        numbersInteger.removeIf(i -> (i % 2 !=0));
        System.out.println(numbersInteger);
        System.out.println(numbersInteger.size());




    }
}
