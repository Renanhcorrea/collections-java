package com.collections.map;

import java.util.Comparator;
import java.util.Map;

public class SortingBookTitle  implements Comparator<Map.Entry<String, BookMap>>{

    @Override
    public int compare(Map.Entry<String, BookMap> o1, Map.Entry<String, BookMap> o2) {
        return o1.getValue().getname().compareToIgnoreCase(o2.getValue().getname());
    }
    
}
