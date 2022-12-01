package lesson;

import java.util.Objects;
public class Author {
    private final String firstName;
    private final String surName;

    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return this.firstName;
    }


    public String getSurName() {
        return this.surName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equalsIgnoreCase(author.firstName) && surName.equalsIgnoreCase(author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surName);
    }
}