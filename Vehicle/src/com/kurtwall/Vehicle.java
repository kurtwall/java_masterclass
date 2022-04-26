package com.kurtwall;

public class Vehicle {

    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        System.out.println("Vehicle.steer(): steering to " + this.currentDirection);
        this.currentDirection += direction;
    }

    public void move(int velocity, int direction) {
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move(); moving at " + this.currentVelocity + " in direction " + this.currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        System.out.println("Vehicle.stop()");
        this.currentVelocity = 0;
    }
}
