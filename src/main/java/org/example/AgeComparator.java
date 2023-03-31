package org.example;
import java.util.Comparator;
/**
 * Defining the Comparator class for age that will be used when creating the TreeSet
 *
 * @author Hegyesi Andrea
 * @version 07.03.2023
 */
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.age.compareTo(p2.age);
    }
}