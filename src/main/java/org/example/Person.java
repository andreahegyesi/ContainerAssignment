package org.example;
import java.util.Objects;
/**
 * Creating the class Person that contains name and age
 * Overriding the toString and equals methods
 *
 * @author Hegyesi Andrea
 * @version 07.03.2023
 */
public class Person {
    String name;
    Integer age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name=" + this.name +
                ", age=" + this.age + "}";
    }
    @Override
    public boolean equals(Object p) {
        if (this == p) {
            return true;
        }
        if (p == null || getClass() != p.getClass()) {
            return false;
        }
        final Person person = (Person) p;
        if (!Objects.equals(name, person.name)) {
            return false;
        }
        return Objects.equals(age, person.age);
    }
}