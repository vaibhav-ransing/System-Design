package ParkingSpot.parkingspot;

import ParkingSpot.vehicle.Vehicle;

public interface ParkingSpot {
    int getId();

    boolean isEmpty();

    int getPrice();

    Vehicle getVehicle();

    void parkVehicle(Vehicle v);

    void removeVehicle();


}


