package com.collections.task.list;

    // Portugu
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    // Utilizando listas, faca um programa que faca 5 perguntas para uma pessoa sobre um crime, as Perguntas sao:
    // 1) Telefonou para a vitima? 2) Esteve no local do crime? 3) Mora perto da vitima? 4) Devia para a vitima? 5) Ja trabalhou com a vitima?
    // Se a pessoa responder positivamente a 2 questoes ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cumplice", e 5 como "Assassina". Caso contrario, ela sera classificado como "Inocente".

    // English
    // Using lists, create a program that asks a person five questions about a crime. The questions are:
    // 1) Did you call the victim? 2) Were you at the crime scene? 3) Do you live near the victim? 4) Did you owe the victim? 5) Have you ever worked with the victim?
    // If the person answers "yes" to 2 questions, they should be classified as "Suspect", between 3 and 4 as "Accomplice," and 5 as "Murderer." Otherwise, they will be classified as "Innocent."


public class TaskTwo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        List<String> answer = new ArrayList<>();

        System.out.println("Just answer with Yes or No.");
        System.out.println("Did you call the victim?");
        String answerOne = scanner.next();
        answer.add(answerOne.toLowerCase());

        System.out.println("Were you at the crime scene?");
        String answerTwo = scanner.next();
        answer.add(answerTwo.toLowerCase());
        
        System.out.println("Do you live near the victim?");
        String answerTree = scanner.next();
        answer.add(answerTree.toLowerCase());
        
        System.out.println("Did you owe the victim?");
        String answerFour = scanner.next();
        answer.add(answerFour.toLowerCase());

        System.out.println("Have you ever worked with the victim?");
        String answerFive = scanner.next();
        answer.add(answerFive.toLowerCase());

        System.out.println(answer);

        int count = 0;
        for (String i : answer) {
            if(i.contains("yes")){
                count++;
            }
        }
        // while (it.hasNext()) {
        //     String i = it.next();
        //     if(i.contains("yes")){
        //         count++;
        //     }
        // }

        switch (count) {
            case (2) -> System.out.println("Suspect");
            case (3), (4) -> System.out.println("Accomplice");
            case (5) -> System.out.println("Murderer");
            default -> System.out.println("Innocent");
        }

        // switch (count) {
        //     case (2) :
        //         System.out.println("Suspect");                
        //         break;
        //     case (3) :
        //     case (4) : 
        //         System.out.println("Accomplice");
        //         break;
        //     case (5) :
        //         System.out.println("Murderer");
        //         break;
        //     default:
        //         System.out.println("Innocent");
        // }
    }
}
