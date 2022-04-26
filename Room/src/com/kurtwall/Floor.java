package com.kurtwall;

public class Floor {
    private String type; // tile, linoleum, wood
    private boolean hasCarpet;

    public Floor(String type, boolean hasCarpet) {
        this.type = type;
        this.hasCarpet = hasCarpet;
    }

    public String getType() {
        return type;
    }

    public boolean hasCarpet() {
        return hasCarpet;
    }

    public void clean() {
        System.out.println("Cleaning floor");
    }
}
