package com.collections.map;

import java.util.Objects;

public class BookMap {
    private String name;
    private Integer page;

    public BookMap(String name, Integer page) {
        this.name = name;
        this.page = page;
    }

    public String getname() {
        return name;
    }

    public Integer getPage() {
        return page;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BookMap book = (BookMap) obj;
        return name.equals(book.name) && page.equals(book.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, page);
    }

    @Override
    public String toString() {
        return "[name=" + name + ", page=" + page + "]";
    }
}
