package com.kurtwall;

public class Wall {
    private String location; // North, South, East, West
    private boolean hasWindow;
    private boolean hasDoor;
    private boolean hasOutlet;
    private boolean hasLightSwitch;
    private String switchStatus;

    public Wall(String location, boolean hasWindow, boolean hasDoor, boolean hasOutlet, boolean hasLightSwitch, String switchStatus) {
        this.location = location;
        this.hasWindow = hasWindow;
        this.hasDoor = hasDoor;
        this.hasOutlet = hasOutlet;
        this.hasLightSwitch = hasLightSwitch;
        this.switchStatus = switchStatus;
    }

    public String getLocation() {
        return location;
    }

    public boolean isHasWindow() {
        return hasWindow;
    }

    public boolean isHasDoor() {
        return hasDoor;
    }

    public boolean getHasOutlet() {
        return hasOutlet;
    }

    public boolean hasLightSwitch() {
        return hasLightSwitch;
    }

    public String getSwitchStatus() {
        return switchStatus;
    }

    public void turnOnLight() {
        if (this.switchStatus == "Off") {
            this.switchStatus = "On";
            System.out.println("Turned on ceiling light");
        } else {
            System.out.println("Light switch already on");
        }
    }

    public void turnOffLight() {
        if (this.switchStatus == "On") {
            this.switchStatus = "Off";
            System.out.println("Turned off ceiling light");
        } else {
            System.out.println("Light switch already off");
        }
    }

}
