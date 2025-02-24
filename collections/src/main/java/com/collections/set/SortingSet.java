package com.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Given the following information about my favorite series, create a set and sort it, displaying:
// SeriesOne: Name: GOT, Genre: Fantasy, EpisodeDuration: 60 min
// SeriesTwo: Name: Dark, Genre: Drama, EpisodeDuration: 60 min
// SeriesThree: Name: That '70s Show, Genre: Comedy, EpisodeDuration: 25 min

public class SortingSet {
    public static void main(String[] args) {
        Set<Series> mySeries = new HashSet<>(){{
            add(new Series("Got", "Fantasy", 60));
            add(new Series("Dark", "Drama", 60));
            add(new Series("That '70s Show", "Comedy", 25));
        }};
        System.out.println("\tRandom");
        for (Series series : mySeries) {
            System.out.println(series.getName() + " - " + series.getGenre() + " - " + series.getEpisodeDuration());
        }

        System.out.println("\n\tInsertion order");
        Set<Series> mySeries2 = new LinkedHashSet<>(){{
            add(new Series("Got", "Fantasy", 60));
            add(new Series("Dark", "Drama", 60));
            add(new Series("That '70s Show", "Comedy", 25));
        }};
        for (Series series : mySeries2) {
            System.out.println(series.getName() + " - " + series.getGenre() + " - " + series.getEpisodeDuration());
        }

        System.out.println("\n\tNatural order (episodeDuration)");
        Set<Series> mySeries3 = new TreeSet<>(mySeries2);
        for (Series series : mySeries3) {
            System.out.println(series.getName() + " - " + series.getGenre() + " - " + series.getEpisodeDuration());
        }

        System.out.println("\n\tOrder Name/Genre/EpsisodeDuration");
        Set<Series> mySeries4 = new TreeSet<>(new ComparatoNameGenreEpisodeDuration());
        mySeries4.addAll(mySeries);
        for(Series series : mySeries4){
            System.out.println(series.getName() + " - " + series.getGenre() + " - " + series.getEpisodeDuration());
        }
    }
}
