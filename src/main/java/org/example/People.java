package org.example;
import java.util.*;
/**
 * Adding Person to the TreeSet
 * Iterating through the TreeSet and printing the name and the age
 * Creating instances of the Address and Hobby classes and adding them to the HashMap
 * For a certain Person, printing he names of the hobbies and the countries where it can be practiced
 *
 * @author Hegyesi Andrea
 * @version 07.03.2023
 */
public class People {
    public static void main(String[] args) {
        TreeSet<Person> personSet1 = new TreeSet<Person>(new NameComparator());
        Person andrea = new Person("Andrea", 27);
        Person maria = new Person("Maria", 18);
        Person catalin = new Person("Catalin", 28);
        personSet1.add(andrea);
        personSet1.add(maria);
        personSet1.add(catalin);
        System.out.println("PersonSet1 (by name): ");
        for (Person person : personSet1) {
            System.out.println(person);
        }
        TreeSet<Person> personSet2 = new TreeSet<Person>(new AgeComparator());
        personSet2.add(andrea);
        personSet2.add(maria);
        personSet2.add(catalin);
        System.out.println("\nPersonSet2 (by age): ");
        for (Person person : personSet2) {
            System.out.println(person);
        }
        Map<Person, List<Hobby>> personMap = new HashMap<Person,List<Hobby>>();
        Address address1 = new Address("France");
        Address address2 = new Address("Spain");
        Address address3 = new Address("Austria");
        Hobby hobby1 = new Hobby("hiking", 10, new ArrayList<Address>(Arrays.asList(address1, address2)));
        Hobby hobby2 = new Hobby("swimming", 5, new ArrayList<Address>(Arrays.asList(address2, address3)));
        Hobby hobby3 = new Hobby("photography", 12, new ArrayList<Address>(Arrays.asList(address1, address2, address3)));
        personMap.put(andrea, new ArrayList<Hobby>(Arrays.asList(hobby1, hobby3)));
        personMap.put(maria, new ArrayList<Hobby>(Arrays.asList(hobby2, hobby3)));
        personMap.put(catalin, new ArrayList<Hobby>(List.of(hobby2)));
        System.out.println("\nIterate through PersonMap: ");
        for (Map.Entry<Person, List<Hobby>> element : personMap.entrySet()) {
            System.out.println(element.getKey().name + ", " + element.getValue());
        }
        System.out.println("\nHobbies with Countries for a certain person:\n" + andrea.name + "'s hobbies are: " + personMap.get(andrea));
    }
}