package com.kurtwall;

public class Room {
    private Floor theFloor;
    private Ceiling theCeiling;
    private Window theWindow;
    private Wall theWall;
    private Door theDoor;

    public Room(Floor theFloor, Ceiling theCeiling, Window theWindow, Wall theWall, Door theDoor) {
        this.theFloor = theFloor;
        this.theCeiling = theCeiling;
        this.theWindow = theWindow;
        this.theWall = theWall;
        this.theDoor = theDoor;
    }

    public Floor getTheFloor() {
        return theFloor;
    }

    public Ceiling getTheCeiling() {
        return theCeiling;
    }

    public Window getTheWindow() {
        return theWindow;
    }

    public Wall getTheWall() {
        return theWall;
    }

    public Door getTheDoor() {
        return theDoor;
    }

    public void enter() {
        if (this.theDoor.isOpen() == true) {
            System.out.println("Entered room");
        } else {
            System.out.println("Door is closed");
        }
    }

    public void exit() {
        if (this.theDoor.isOpen() == true) {
            System.out.println("Close the door first");
        } else {
            System.out.println("Exited room");
        }
    }
}
