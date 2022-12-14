package com.darshan09200.employeemanagementsystem;

import java.time.LocalDate;
import java.time.Period;

public abstract class Employee {
    private static int EMP_COUNT = 0;
    static final double DEFAULT_OCCUPATION_RATE = 100;

    private String profileImage;
    private final String empId;
    private final String firstName;
    private final String lastName;
    private LocalDate dob;
    private double occupationRate;
    private double monthlySalary;
    private EmployeeType role;
    private Vehicle vehicle;

    public Employee(String profileImage, String empId, String firstName, String lastName, LocalDate dob, double occupationRate, double monthlySalary, EmployeeType role, Vehicle vehicle) {
        this.profileImage = profileImage;
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.occupationRate = formatOccupationRate(occupationRate);
        this.monthlySalary = monthlySalary;
        this.role = role;
        this.vehicle = vehicle;

        incrementEmpCount();
        System.out.println("We have a new employee: " + getFirstName() + ", a " + getRole() + ".");
    }

    public static int getEmpCount() {
        return EMP_COUNT;
    }

    public static void incrementEmpCount() {
        EMP_COUNT++;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    private static double formatOccupationRate(double occupationRate) {
        return Math.max(0, Math.min(occupationRate, DEFAULT_OCCUPATION_RATE));
    }

    public double getOccupationRate() {
        return occupationRate;
    }

    public void setOccupationRate(double occupationRate) {
        this.occupationRate = formatOccupationRate(occupationRate);
    }

    public EmployeeType getRole() {
        return role;
    }

    public void setRole(EmployeeType role) {
        this.role = role;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getAnnualIncome() {
        return getMonthlySalary() * 12 * (getOccupationRate() / 100);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", name='" + firstName + '\'' +
                ", dob=" + dob +
                ", occupationRate=" + occupationRate +
                ", monthlySalary=" + monthlySalary +
                ", role=" + role +
                ", vehicle=" + vehicle +
                '}';
    }
}
