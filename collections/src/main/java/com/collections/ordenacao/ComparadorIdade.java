package com.collections.ordenacao;

import java.util.Comparator;

public class ComparadorIdade implements Comparator<Gato>  {

    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
    
}
