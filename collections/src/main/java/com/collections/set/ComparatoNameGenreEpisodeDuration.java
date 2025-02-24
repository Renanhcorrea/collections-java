package com.collections.set;

import java.util.Comparator;

public class ComparatoNameGenreEpisodeDuration implements Comparator<Series> {

    @Override
    public int compare(Series o1, Series o2) {
        
        
        int name = o1.getName().compareTo(o2.getName());
        if (name != 0) return name;        
        int genre = o1.getGenre().compareTo(o2.getGenre());
        if (genre !=0 ) return genre;

        return Integer.compare(o1.getEpisodeDuration(), o2.getEpisodeDuration());
    }


    
}
