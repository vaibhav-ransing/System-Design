package ParkingSpot.manager;

import ParkingSpot.parkingspot.ParkingSpot;
import ParkingSpot.vehicle.Vehicle;

import java.util.HashMap;
import java.util.List;

public class FourWheelerParkingSpotManager implements ParkingSpotManager {

    List<ParkingSpot> parkingSpotList;

    HashMap<Vehicle, ParkingSpot> map;

    FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
        this.map = new HashMap<>();
    }

    @Override
    public List<ParkingSpot> getParkingSpotList() {
        return this.parkingSpotList;
    }

    @Override
    public ParkingSpot findParkingSpot() {
        if (parkingSpotList.isEmpty())
            return null;
        return this.parkingSpotList.get(0);
    }

    @Override
    public ParkingSpot removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpot.removeVehicle();
        parkingSpotList.add(parkingSpot);
        return parkingSpot;
    }

    @Override
    public ParkingSpot parkVehicle(Vehicle vehicle) {

        ParkingSpot parkingSpot = parkingSpotList.get(0);
        parkingSpot.parkVehicle(vehicle);

        map.put(vehicle, parkingSpot);
        this.parkingSpotList.remove(parkingSpot);

        return parkingSpot;
    }

    @Override
    public ParkingSpot removeVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = map.get(vehicle);
        return this.removeParkingSpot(parkingSpot);
    }
}