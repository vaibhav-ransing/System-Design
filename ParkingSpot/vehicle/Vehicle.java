package ParkingSpot.vehicle;

public class Vehicle {

    String number;
    VehicleType vehicleType;

    public Vehicle(String number, VehicleType vehicleType) {
        this.number = number;
        this.vehicleType = vehicleType;
    }

    public String getNumber() {
        return number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
