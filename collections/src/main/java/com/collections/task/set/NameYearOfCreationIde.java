package com.collections.task.set;

import java.util.Comparator;

public class NameYearOfCreationIde implements Comparator<ProgrammingLanguage>{

    @Override
    public int compare(ProgrammingLanguage o1, ProgrammingLanguage o2) {
        int name = o1.getName().compareTo(o2.getName());
        if (name != 0) return name;
        int yearOfCreation = o1.getYearOfCreation().compareTo(o2.getYearOfCreation());
        if(yearOfCreation != 0) return yearOfCreation;

        return o1.getIde().compareTo(o2.getIde());
    }
    
    
}
