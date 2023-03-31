package org.example;
/**
 * Creating the class Address which contains the country where the hobby can be practiced
 *
 * @author Hegyesi Andrea
 * @version 07.03.2023
 */
public class Address {
    String country;
    String city;
    public Address(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return this.country;
    }
}