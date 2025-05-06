package com.pluralsight;

public class Reservation {

    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        updatePrice();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
        updatePrice();
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        this.isWeekend = weekend;
        updatePrice();
    }

    public double getReservationTotal() {
        return price * numberOfNights;
    }

    private void updatePrice() {
        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else {
            price = 124.00;
        }
        if (isWeekend) {
            price *= 1.10;
        }
    }
}
