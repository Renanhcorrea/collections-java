package com.collections.task;

import java.util.Objects;

public class ProgrammingLanguage implements Comparable<ProgrammingLanguage> {
    
    private String name;
    private Integer yearOfCreation;
    private String ide;

    public ProgrammingLanguage(String name, Integer yearOfCreation, String ide) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.ide = ide;
    }

    public String getName() {
        return name;
    }

    public Integer getYearOfCreation() {
        return yearOfCreation;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", yearOfCreation=" + yearOfCreation + ", ide=" + ide + "]";
    }

    @Override
    public int compareTo(ProgrammingLanguage obj) {
        return this.name.compareTo(obj.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ProgrammingLanguage programmingLanguage = (ProgrammingLanguage) obj;
        return name.equals(programmingLanguage.name) && yearOfCreation.equals(programmingLanguage.yearOfCreation) && ide.equals(programmingLanguage.ide);
    }
}