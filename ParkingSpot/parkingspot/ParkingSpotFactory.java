package ParkingSpot.parkingspot;

import ParkingSpot.vehicle.Vehicle;
import ParkingSpot.vehicle.VehicleType;

public class ParkingSpotFactory {

    private FourWheelerSpot fourWheelerSpot;
    private TwoWheelerSpot twoWheelerSpot;

    public ParkingSpot getParkingSpotObject(Vehicle vehicle) {
        if (vehicle.getVehicleType().equals(VehicleType.TWO_WHEELER)) {
//            if (this.twoWheelerSpot == null) {
//                this.twoWheelerSpot = new TwoWheelerSpot(20, vehicle);
//            }
//            return this.twoWheelerSpot;
            return new TwoWheelerSpot(20, vehicle);
        } else {
//            if (this.fourWheelerSpot == null) {
//                this.fourWheelerSpot = new FourWheelerSpot(50, vehicle);
//            }
//            return this.fourWheelerSpot;
            return new FourWheelerSpot(50, vehicle);
        }
    }
}
