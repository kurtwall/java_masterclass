package com.kurtwall;

public class Ceiling {
    private boolean hasLight;
    private String lightStatus; // On, Off

    public Ceiling(boolean isTextured, boolean hasLight) {
        this.hasLight = hasLight;
        this.lightStatus = "Off";
    }

    public boolean hasLight() {
        return hasLight;
    }

    public String getLightStatus() {
        return lightStatus;
    }
}
