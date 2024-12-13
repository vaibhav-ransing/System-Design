package ParkingSpot.gates;

import ParkingSpot.manager.ParkingSpotManager;
import ParkingSpot.parkingspot.ParkingSpot;
import ParkingSpot.vehicle.Vehicle;

public class ExitGate {

    ParkingSpotManager parkingSpotManager;

    public ExitGate(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
    }


    public ParkingSpot assignParkingSpot(Vehicle vehicle) {
        return parkingSpotManager.removeVehicle(vehicle);
    }
}
