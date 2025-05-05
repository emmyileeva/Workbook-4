package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void checkIn() {
        if (isAvailable()) {
            isOccupied = true;
        } else {
            System.out.println("Room is not available for check-in.");
        }
    }

    public void checkOut() {
        if (isOccupied) {
            isOccupied = false;
            isDirty = true; // Mark room as dirty after check-out
        } else {
            System.out.println("Room is not occupied.");
        }
    }

    public void cleanRoom() {
        if (isDirty) {
            isDirty = false; // Clean the room
        } else {
            System.out.println("Room is not dirty.");
        }
    }
}
