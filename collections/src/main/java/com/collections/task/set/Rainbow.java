package com.collections.task.set;

public class Rainbow implements Comparable<Rainbow> {

    private String colour;

    public Rainbow(String colour) {
        this.colour = colour;
    }

    @Override
    public int compareTo(Rainbow o) {
        return this.getColour().compareTo(o.getColour());
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rainbow{");
        sb.append("colour=").append(colour);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((colour == null) ? 0 : colour.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Rainbow rainbow = (Rainbow) obj;
        
        return colour.equals(rainbow.colour);
    }

    public boolean startWith(String string) {
        return colour.toLowerCase().startsWith(string.toLowerCase());
    }   


    
}
