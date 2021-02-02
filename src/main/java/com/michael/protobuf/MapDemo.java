package com.michael.protobuf;

import com.michaelcasas.stubs.BodyStyle;
import com.michaelcasas.stubs.Car;
import com.michaelcasas.stubs.Dealer;

public class MapDemo {

    public static void main(String[] args) {
        Car accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setBodyStyle(BodyStyle.COUPE)
                .setYear(2020)
                .build();
        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setBodyStyle(BodyStyle.SEDAN)
                .setYear(2012)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(2012, civic)
                .putModel(2020, accord)
                .build();

        System.out.println(
            dealer.getModelOrThrow(2020).getBodyStyle()
        );
    }
}
