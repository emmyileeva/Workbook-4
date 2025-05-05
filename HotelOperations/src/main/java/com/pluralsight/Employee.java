package com.pluralsight;

public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private boolean isPunchedIn;
    private double lastPunchInTime;

    public Employee(String employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
        this.isPunchedIn = false;
        this.lastPunchInTime = 0.0;
    }

    public double getTotalPay() {
        return payRate * hoursWorked;
    }

    public int getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        } else {
            return hoursWorked;
        }
    }

    public int getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public void punchTimeCard(double time) {
        if (!isPunchedIn) {
            // punch in
            lastPunchInTime = time;
            isPunchedIn = true;
            System.out.println("Punched in at: " + time);
        } else {
            // punch out
            double hoursWorkedToday = time - lastPunchInTime;
            if (hoursWorkedToday > 0) {
                hoursWorked += hoursWorkedToday;
                System.out.println("Punched out at: " + time + ". Hours worked today: " + hoursWorkedToday);
            } else {
                System.out.println("Invalid punch out time. Punch out time must be greater than punch in time.");
            }
            isPunchedIn = false;
        }
    }
}