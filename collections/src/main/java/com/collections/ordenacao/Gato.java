package com.collections.ordenacao;

public class Gato implements Comparable<Gato> {
    private String name;
    private Integer age;
    private String colour;
    
    public Gato(String name, Integer age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", colour=").append(colour);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getName().compareToIgnoreCase(gato.getName());
    }
    

    

}
