package org.example;

interface Comparable {
    void compareTo(Car another);
}

public class Car implements Comparable {

    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void compareTo(Car another) {
        if (this.price < another.getPrice()) {
            System.out.println("1 car is better");
            return;
        }
        if (this.price > another.getPrice()) {
            System.out.println("2 car is better");
            return;
        }
        if (this.year > another.getYear()) {
            System.out.println("1 car is better");
            return;
        }
        if (this.year < another.getYear()) {
            System.out.println("2 car is better");
            return;
        }
        if (this.horsePower > another.getHorsePower()) {
            System.out.println("1 car is better");
            return;
        }
        if (this.horsePower < another.getHorsePower()) {
            System.out.println("2 car is better");
            return;
        }
        System.out.println("Both cars are the same");
    }
}