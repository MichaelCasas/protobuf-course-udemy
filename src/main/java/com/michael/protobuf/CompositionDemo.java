package com.michael.protobuf;

import com.michaelcasas.stubs.Address;
import com.michaelcasas.stubs.Car;
import com.michaelcasas.stubs.Person;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {

    public static void main(String[] args) {

        Address address = Address.newBuilder()
                .setPostbox(123)
                .setStreet("main st")
                .setCity("Atlanta")
                .build();

        Car accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2020)
                .build();
        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2012)
                .build();

        List<Car> cars = new ArrayList<Car>();
        cars.add(accord);
        cars.add(civic);

        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(25)
                .setAddress(address)
                .addAllCar(cars)
                .build();

        System.out.println(
                sam
        );
    }
}
