package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        // Create room
        Floor floor = new Floor("wood", true);
        Ceiling ceiling = new Ceiling(false, true);
        Window northWindow = new Window("North", true, false);
        Wall northWall = new Wall("North", true, false, true, true, "Off");
        Door northDoor = new Door(false, true);
        Room bedroom = new Room(floor, ceiling, northWindow, northWall, northDoor);

	    // Enter the room
        bedroom.getTheDoor().unlock();
        bedroom.getTheDoor().open();
        bedroom.enter();
        
        // Turn on the light
        if (bedroom.getTheCeiling().hasLight()) {
            if (bedroom.getTheWall().hasLightSwitch()) {
                bedroom.getTheWall().turnOnLight();
            }
        }
        
        // Look at walls for windows
        if (bedroom.getTheWall().hasLightSwitch() && bedroom.getTheCeiling().hasLight()) {
            bedroom.getTheWall().turnOnLight();
        }
        
        // Look at walls for outlets
        System.out.println("Outlet: " + bedroom.getTheWall().getHasOutlet());
        
        // Open window
        bedroom.getTheWindow().open();
        
        // Clean carpet
        if (bedroom.getTheFloor().hasCarpet()) {
            bedroom.getTheFloor().clean();
        } else {
            System.out.println("No carpet to clean");
        }
        // Close window
        bedroom.getTheWindow().close();
        
        // Turn off light
        if (bedroom.getTheWall().hasLightSwitch() && bedroom.getTheCeiling().hasLight()) {
            bedroom.getTheWall().turnOffLight();
        }

        // Close and lock door
        bedroom.exit();
        bedroom.getTheDoor().close();
        bedroom.getTheDoor().lock();
    }
}
