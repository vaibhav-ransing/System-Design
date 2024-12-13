package ParkingSpot.gates;

import ParkingSpot.manager.ParkingSpotManager;
import ParkingSpot.parkingspot.ParkingSpot;
import ParkingSpot.vehicle.Vehicle;

public class EntranceGate {

    ParkingSpotManager parkingSpotManager;

    public EntranceGate(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
    }


    public ParkingSpot assignParkingSpot(Vehicle vehicle) {
        return parkingSpotManager.parkVehicle(vehicle);
    }


}
