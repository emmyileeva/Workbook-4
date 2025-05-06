package com.pluralsight;

import java.time.LocalDateTime;

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

    public void punchIn(double time) {
        if (!isPunchedIn) {
            isPunchedIn = true;
            lastPunchInTime = time;
            System.out.println(name + " punched in at " + time + ".");
        } else {
            System.out.println("Already punched in.");
        }
    }

    public void punchOut(double time) {
        if (isPunchedIn) {
            isPunchedIn = false;
            double hoursWorkedToday = time - lastPunchInTime;
            hoursWorked += hoursWorkedToday;
            System.out.println("Punched out at " + time + ". Worked " + hoursWorkedToday + " hours today.");
        } else {
            System.out.println("Already punched out.");
        }
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + (now.getMinute() / 60.0);
        punchIn(time);
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + (now.getMinute() / 60.0);
        punchOut(time);
    }
}