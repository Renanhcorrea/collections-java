package com.collections.set;

public class Series implements Comparable<Series>{
    private String name;
    private String genre;
    private Integer episodeDuration;

    public Series(String name, String genre, Integer episodeDuration) {
        this.name = name;
        this.genre = genre;
        this.episodeDuration = episodeDuration;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getEpisodeDuration() {
        return episodeDuration;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", genre=" + genre + ", episodeDuration=" + episodeDuration + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + ((episodeDuration == null) ? 0 : episodeDuration.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Series serie = (Series) obj;

        return name.equals(serie.name) && genre.equals(serie.genre) && episodeDuration.equals(serie.episodeDuration);
    }

    @Override
    public int compareTo(Series serie) {
        int episodeDuration = Integer.compare(this.getEpisodeDuration(), serie.getEpisodeDuration());
        if (episodeDuration != 0) return episodeDuration;

        return this.getGenre().compareTo(serie.getGenre());
    }  

    
}
