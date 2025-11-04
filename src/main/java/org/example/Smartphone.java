package org.example;

import java.util.ArrayList;

interface GPS {
    double[] getCoordinates();
}

interface Cellular {
    void makeCall(int number);
    void receiveCall(int number);
}

public class Smartphone implements GPS, Cellular {

    double[] coordinates = new double[2];

    @Override
    public double[] getCoordinates() {
        return coordinates;
    }

    boolean InternetOn;
    ArrayList<Integer> callHistory = new ArrayList<>();

    @Override
    public void makeCall(int number) {
        InternetOn = false;
        callHistory.add(number);
    }

    @Override
    public void receiveCall(int number) {
        InternetOn = false;
        callHistory.add(number);
    }
}
