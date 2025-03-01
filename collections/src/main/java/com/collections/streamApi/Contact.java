package com.collections.streamApi;

import java.util.Objects;

public class Contact {
    private String name;
    private Integer number;

    public Contact(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Contact contact = (Contact) obj;
        return this.name.equals(contact.name) && this.number.equals(contact.number);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("name=").append(name);
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
