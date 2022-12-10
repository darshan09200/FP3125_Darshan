package com.darshan09200.employeemanagementsystem;


import java.util.ArrayList;

interface EnhancedEnum {
    String label = null;

    String getLabel();
}

enum EmployeeType implements EnhancedEnum {
    MANAGER("Manager"),
    PROGRAMMER("Programmer"),
    TESTER("Tester");

    private final String label;

    EmployeeType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}


enum Vehicle implements EnhancedEnum {
    BOTH("Both"),
    CAR("Car"),
    MOTORCYCLE("Motorcycle");

    private final String label;

    Vehicle(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

enum VehicleMake implements EnhancedEnum {
    CHOOSE_MAKE("Please choose a make", Vehicle.BOTH),
    KAWASAKI("Kawasaki", Vehicle.MOTORCYCLE),
    HONDA("Honda", Vehicle.BOTH),
    LAMBORGHINI("Lamborghini", Vehicle.CAR),
    BMW("BMW", Vehicle.CAR),
    RENAULT("Renault", Vehicle.CAR),
    MAZDA("Mazda", Vehicle.CAR);

    private final String label;
    private final Vehicle vehicle;

    VehicleMake(String label, Vehicle vehicle) {
        this.label = label;
        this.vehicle = vehicle;
    }

    public String getLabel() {
        return label;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

enum VehicleCategory implements EnhancedEnum {
    CHOSE_CATEGORY("Please choose a category", Vehicle.BOTH),
    RACE_MOTORCYCLE("Race Motorcycle", Vehicle.MOTORCYCLE),
    NOT_FOR_RACE("Not for Race", Vehicle.BOTH),
    FAMILY("Family", Vehicle.CAR);

    private final String label;
    private final Vehicle vehicle;

    VehicleCategory(String label, Vehicle vehicle) {
        this.label = label;
        this.vehicle = vehicle;
    }

    public String getLabel() {
        return label;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

enum VehicleType implements EnhancedEnum {
    CHOOSE_TYPE("Please choose a type"),
    SEDAN("Sedan"),
    SPORT("Sport"),
    HATCHBACK("Hatchback"),
    SUV("SUV");

    private final String label;

    VehicleType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

enum VehicleColor implements EnhancedEnum {
    CHOOSE_COLOR("Please choose a color"),
    YELLOW("Yellow"),
    BLACK("Black"),
    WHITE("White"),
    RED("Red");

    private final String label;

    VehicleColor(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}


public class Registration {
    private static Registration instance;

    private Vehicle vehicle = Vehicle.CAR;

    private Registration() {
    }

    public static Registration getInstance() {
        if (instance == null) instance = new Registration();
        return instance;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ArrayList<String> getEmployeeTypeData() {
        ArrayList<String> employeeTypes = new ArrayList<>();

        for (EmployeeType employeeType :
                EmployeeType.values()) {
            employeeTypes.add(employeeType.getLabel());
        }
        return employeeTypes;
    }

    public ArrayList<String> getVehicleMakeData() {
        ArrayList<String> vehicleMakes = new ArrayList<>();

        for (VehicleMake vehicleMake :
                VehicleMake.values()) {
            if (vehicleMake.getVehicle() == vehicle || vehicleMake.getVehicle() == Vehicle.BOTH)
                vehicleMakes.add(vehicleMake.getLabel());
        }
        return vehicleMakes;
    }

    public ArrayList<String> getVehicleCategoryData() {
        ArrayList<String> vehicleCategories = new ArrayList<>();

        for (VehicleCategory vehicleCategory :
                VehicleCategory.values()) {
            if (vehicleCategory.getVehicle() == vehicle || vehicleCategory.getVehicle() == Vehicle.BOTH)
                vehicleCategories.add(vehicleCategory.getLabel());
        }
        return vehicleCategories;
    }

    public ArrayList<String> getVehicleTypeData() {
        ArrayList<String> vehicleTypes = new ArrayList<>();

        for (VehicleType vehicleType :
                VehicleType.values()) {
            vehicleTypes.add(vehicleType.getLabel());
        }
        return vehicleTypes;
    }

    public ArrayList<String> getVehicleColorData() {
        ArrayList<String> vehicleColors = new ArrayList<>();

        for (VehicleColor vehicleColor :
                VehicleColor.values()) {
            vehicleColors.add(vehicleColor.getLabel());
        }
        return vehicleColors;
    }

}
