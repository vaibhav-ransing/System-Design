package ParkingSpot.manager;

import ParkingSpot.parkingspot.ParkingSpot;
import ParkingSpot.parkingspot.ParkingSpotFactory;
import ParkingSpot.vehicle.Vehicle;
import ParkingSpot.vehicle.VehicleType;

import java.util.List;

public class ParkingSpotManagerFactory {

    private TwoWheelerParkingSpotManager twoWheelerParkingSpotManager;
    private FourWheelerParkingSpotManager fourWheelerParkingSpotManager;

    public ParkingSpotManager getParkingSpotManager(Vehicle vehicle, List<ParkingSpot> parkingSpotList) {
        if (vehicle.getVehicleType().equals(VehicleType.TWO_WHEELER)) {
            if(this.twoWheelerParkingSpotManager == null){
                this.twoWheelerParkingSpotManager = new TwoWheelerParkingSpotManager(parkingSpotList);
            }
            return  this.twoWheelerParkingSpotManager;
//            return new TwoWheelerParkingSpotManager(parkingSpotList);
        } else {
            if(this.fourWheelerParkingSpotManager == null){
                this.fourWheelerParkingSpotManager = new FourWheelerParkingSpotManager(parkingSpotList);
            }
            return this.fourWheelerParkingSpotManager;
//            return new FourWheelerParkingSpotManager(parkingSpotList);
        }
    }
}
