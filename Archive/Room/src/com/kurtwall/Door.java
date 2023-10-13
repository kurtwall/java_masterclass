package com.kurtwall;

    public class Door {
        private boolean isOpen;
        private boolean isLocked;

    public Door(boolean isOpen, boolean isLocked) {
        this.isOpen = isOpen;
        this.isLocked = isLocked;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void open() {
        if (!this.isOpen()) {
            if (this.isLocked()) {
                System.out.println("Door is locked");
            } else {
                this.isOpen = true;
                System.out.println("Opened door");
            }
        } else {
            System.out.println("Door already open");
        }
    }

    public void close() {
        if (this.isOpen) {
            this.isOpen = false;
            System.out.println("Closed door");
        } else {
            System.out.println("Door already closed");
        }
    }

    public void lock() {
        if (!this.isLocked) {
            this.isLocked = true;
            System.out.println("Locked door");
        } else {
            System.out.println("Door already locked");
        }
    }

    public void unlock() {
        if (this.isLocked) {
            this.isLocked = false;
            System.out.println("Unlocked door");
        } else {
            System.out.println("Door already unlocked");
        }
    }
}
