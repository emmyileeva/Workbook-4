package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // Testing for Employee class
        Employee employee = new Employee("E123", "John Doe", "IT", 20.00);
        employee.punchIn(9.00);
        employee.punchOut(17.00);
        System.out.println("Total pay: " + employee.getTotalPay());

        // Testing for Reservation class
        Reservation reservation = new Reservation("king", 139.00, 3, true);
        System.out.println("Room type: " + reservation.getRoomType());
        System.out.println("Price per night: " + reservation.getPrice());
        System.out.println("Total price for 3 nights: " + reservation.getReservationTotal());

        // Testing for Hotel class
        Hotel hotel = new Hotel("Grand Plaza", 10, 50);
        System.out.println("Available rooms: " + hotel.getAvailableRooms());
        System.out.println("Available suites: " + hotel.getAvailableSuites());
        System.out.println("Booking 5 rooms: " + hotel.bookRoom(5, false));
        System.out.println("Available rooms after booking: " + hotel.getAvailableRooms());
    }
}