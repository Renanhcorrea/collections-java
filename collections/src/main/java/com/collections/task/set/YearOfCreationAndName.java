package com.collections.task.set;

import java.util.Comparator;

public class YearOfCreationAndName implements Comparator<ProgrammingLanguage> {

    @Override
    public int compare(ProgrammingLanguage o1, ProgrammingLanguage o2) {
        int yearOfCreation = Integer.compare(o1.getYearOfCreation(), o2.getYearOfCreation());
        if (yearOfCreation != 0) return yearOfCreation;
    
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
    
}
