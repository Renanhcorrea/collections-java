package com.collections.task.set;

// Create a class FavoriteLanguage with the attributes name, yearOfCreation, and IDE. Then, create a set with three programming languages and write a program that sorts this set by:

// a) Order of insertion
// b) Natural order (name)
// c) IDE
// d) Year of creation and name
// e) Name, year of creation and IDE

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskFour {
    public static void main(String[] args) {
        Set<ProgrammingLanguage> language = new HashSet<>(){{
            add(new ProgrammingLanguage("Java", 1995, "IntelliJ"));
            add(new ProgrammingLanguage("Python", 1991, "VS Code"));
            add(new ProgrammingLanguage("C++", 1985, "Code::Blocks"));
        }};
        System.out.println(language);

        LinkedHashSet<ProgrammingLanguage> languageLinkedHash = new LinkedHashSet<>(
            Arrays.asList(
                new ProgrammingLanguage("Java", 1995, "Intellij"),
                new ProgrammingLanguage("Python", 1991, "VS Code"),
                new ProgrammingLanguage("C++", 1985, "Code::Blocks")
        ));
        System.out.println("Order of insertion");
        for (ProgrammingLanguage programmingLanguage : languageLinkedHash) {
            System.out.println("name: " + programmingLanguage.getName() + "  year: " + programmingLanguage.getYearOfCreation() + "  IDE: " + programmingLanguage.getIde());
        }

        System.out.println("Natural order (name)");
        Set<ProgrammingLanguage> languageTreeSet = new TreeSet<>(languageLinkedHash);
        for (ProgrammingLanguage programmingLanguage : languageTreeSet) {
            System.out.println("name: " + programmingLanguage.getName() + "  year: " + programmingLanguage.getYearOfCreation() + "  IDE: " + programmingLanguage.getIde());
        }
        
        System.out.println("Order by IDE");
        Set<ProgrammingLanguage> programmingLanguagesTwo = new TreeSet<>(new ComparadorIde());
        programmingLanguagesTwo.addAll(languageTreeSet);
        for (ProgrammingLanguage programmingLanguage : programmingLanguagesTwo) {
            System.out.println("name: " + programmingLanguage.getName() + "  year: " + programmingLanguage.getYearOfCreation() + "  IDE: " + programmingLanguage.getIde());
        }

        System.out.println("Order by year of creation and name");
        Set<ProgrammingLanguage> programmingLanguagesThree = new TreeSet<>(new YearOfCreationAndName());
        programmingLanguagesThree.addAll(languageTreeSet);
        for (ProgrammingLanguage programmingLanguage : programmingLanguagesThree) {
            System.out.println("name: " + programmingLanguage.getName() + "  year: " + programmingLanguage.getYearOfCreation() + "  IDE: " + programmingLanguage.getIde());            
        }

        System.out.println("Order by name, year of creation and IDE");
        Set<ProgrammingLanguage> programmingLanguagesFour = new TreeSet<>(new NameYearOfCreationIde());
        programmingLanguagesFour.addAll(languageTreeSet);
        for (ProgrammingLanguage programmingLanguage : programmingLanguagesFour) {
            System.out.println("name: "+ programmingLanguage.getName() + "  year: " + programmingLanguage.getYearOfCreation() + "  IDE: " + programmingLanguage.getIde());
        }
    }
}
