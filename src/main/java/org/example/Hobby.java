package org.example;
import java.util.*;
/**
 * Creating the class Hobby that contains name of the hobby, frequency and list of addresses where this hobby can be practiced
 *
 * @author Hegyesi Andrea
 * @version 07.03.2023
 */
public class Hobby {
    String nameOfHobby;
    int frequency;
    List<Address> addressList;
    public Hobby(String nameOfHobby, int frequency, List<Address> addressList) {
        this.nameOfHobby = nameOfHobby;
        this.frequency = frequency;
        this.addressList = addressList;
    }
    public String toString() {
        return  this.nameOfHobby + " in " + addressList.toString();
    }
}