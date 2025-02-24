package com.collections.task;

import java.util.Comparator;

public class ComparadorIde implements Comparator<ProgrammingLanguage> {

    @Override
    public int compare (ProgrammingLanguage o1, ProgrammingLanguage o2) {
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
    
}
