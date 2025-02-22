package com.collections.ordenacao;

import java.util.Comparator;

public class CompradorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getColour().compareToIgnoreCase(o2.getColour());
    }
    
}
