package ParkingSpot;

import ParkingSpot.gates.EntranceGate;
import ParkingSpot.manager.ParkingSpotManager;
import ParkingSpot.manager.ParkingSpotManagerFactory;
import ParkingSpot.parkingspot.ParkingSpot;
import ParkingSpot.parkingspot.ParkingSpotFactory;
import ParkingSpot.vehicle.Vehicle;
import ParkingSpot.vehicle.VehicleType;

import java.util.List;

public class main {


    public void main(String[] args) {

        /* New Vehicle Came */
        Vehicle vehicle = new Vehicle("MH12-NL-1234", VehicleType.TWO_WHEELER);

        /* Keep ParkingSpots ready */
        ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory();

        /* Get the list of parking spots from database */
        List<ParkingSpot> twoWheelerParkingSpotList; // get this from database or something

        ParkingSpotManagerFactory parkingSpotManagerFactory;

        /* In Entrance gate excepts a parking spot manager which is created using parkingSpotFactory
        which create single object of two and four wheeler parkingSpotManagers */
        EntranceGate entranceGate = new EntranceGate((ParkingSpotManager) parkingSpotFactory.getParkingSpotObject(vehicle));

        /* We can assign parking spot which will be delegated to ParkingSpotManager  */
        entranceGate.assignParkingSpot(vehicle);

    }


}
