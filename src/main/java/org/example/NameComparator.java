package org.example;
import java.util.Comparator;
/**
 * Defining the Comparator class for name that will be used when creating the TreeSet
 *
 * @author Hegyesi Andrea
 * @version 07.03.2023
 */
public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}