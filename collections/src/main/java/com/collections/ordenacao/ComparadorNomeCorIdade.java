package com.collections.ordenacao;

import java.util.Comparator;

public class ComparadorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        int nome =o1.getName().compareToIgnoreCase(o2.getName());
        if (nome != 0 ){
            return nome;
        } 

        int cor = o1.getColour().compareToIgnoreCase(o2.getColour());
        if (cor != 0 ) {
            return cor;
        }
        
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    
}
