package com.kurtwall;

public class Window {
    private String location; // North, South, East, West
    private boolean isOpen;

    public Window(String location, boolean isDoublePaned, boolean isOpen) {
        this.location = location;
        this.isOpen = isOpen;
    }

    public String getLocation() {
        return location;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open() {
        if (!this.isOpen) {
            this.isOpen = true;
            System.out.println("Opened " + this.location + " window");
        } else {
            System.out.println(this.location + " window already open");
        }
    }

    public void close() {
        if (this.isOpen) {
            this.isOpen = false;
            System.out.println("Closed " + this.location + " window");
        } else {
            System.out.println(this.location + " window already closed");
        }
    }

}
