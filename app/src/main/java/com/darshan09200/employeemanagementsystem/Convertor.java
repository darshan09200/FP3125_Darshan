package com.darshan09200.employeemanagementsystem;

public class Convertor {

    public static EmployeeType convertEmployeeType(String text) {
        for (EmployeeType employeeType :
                EmployeeType.values()) {
            if (employeeType.getLabel().equalsIgnoreCase(text)) return employeeType;
        }
        return null;
    }

    public static VehicleKind convertVehicle(String text) {
        for (VehicleKind v :
                VehicleKind.values()) {
            if (v.getLabel().equalsIgnoreCase(text)) return v;
        }
        return null;
    }

    public static VehicleMake convertVehicleMake(String text) {
        for (VehicleMake v :
                VehicleMake.values()) {
            if (v.getLabel().equalsIgnoreCase(text)) return v;
        }
        return null;
    }

    public static VehicleCategory convertVehicleCategory(String text) {
        for (VehicleCategory v :
                VehicleCategory.values()) {
            if (v.getLabel().equalsIgnoreCase(text)) return v;
        }
        return null;
    }

    public static VehicleType convertVehicleType(String text) {
        for (VehicleType v :
                VehicleType.values()) {
            if (v.getLabel().equalsIgnoreCase(text)) return v;
        }
        return null;
    }

    public static VehicleColor convertVehicleColor(String text) {
        for (VehicleColor v :
                VehicleColor.values()) {
            if (v.getLabel().equalsIgnoreCase(text)) return v;
        }
        return null;
    }
}
