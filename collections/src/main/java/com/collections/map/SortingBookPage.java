package com.collections.map;

import java.util.Comparator;
import java.util.Map;

public class SortingBookPage implements Comparator<Map.Entry<String, BookMap>> {

    @Override
    public int compare(Map.Entry<String, BookMap> o1, Map.Entry<String, BookMap> o2) {
        return o1.getValue().getPage().compareTo(o2.getValue().getPage());
    }
    
    
}
