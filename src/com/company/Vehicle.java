package com.company;

public class Vehicle {
    private int length, noOfSeats, noOfTires, currentSpeed, speed2;
    private String name;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNoOfSeats() {
        return this.noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfTires() {
        return this.noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getSpeed2() {
        return this.speed2;
    }

    public void setSpeed2(int Speed2) {
        this.speed2 = Speed2;}

    public void startEngine(boolean key) {
        if (key) {
            System.out.println("Engine switched on!");
        } else {
            System.out.println("Please insert the key");
        }
    }

    public void stopEngine() {
        System.out.println("Engine switched off");
    }
     public void speedUP () {
        if(this.speed2 == currentSpeed + 5) {
            System.out.println("Vehicle is speeding up. ");
        }
         }

     public void slowDown() {
        if(this.speed2  == currentSpeed - 5){
            System.out.println("Vehicle is slowing down. ");
        }
     }
}
