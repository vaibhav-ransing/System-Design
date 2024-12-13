package ParkingSpot.manager;

import ParkingSpot.parkingspot.ParkingSpot;
import ParkingSpot.vehicle.Vehicle;

import java.util.List;

public interface ParkingSpotManager {

    List<ParkingSpot> getParkingSpotList();

    ParkingSpot findParkingSpot();

    ParkingSpot removeParkingSpot(ParkingSpot parkingSpot);

    ParkingSpot parkVehicle(Vehicle vehicle);

    ParkingSpot removeVehicle(Vehicle vehicle);
}
