package ParkingSpot.parkingspot;

import ParkingSpot.vehicle.Vehicle;

public class FourWheelerSpot implements ParkingSpot {
    private int id;
    private boolean isEmpty;
    private Vehicle vehicle;
    private int price;

    public FourWheelerSpot(int id, int price, Vehicle vehicle) {
        this.id = id;
        this.isEmpty = true;
        this.vehicle = vehicle;
        this.price = price;
    }
    public FourWheelerSpot(int price, Vehicle vehicle) {
        this.isEmpty = true;
        this.vehicle = null;
        this.price = price;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public void parkVehicle(Vehicle v) {
        if (!isEmpty) {
            throw new IllegalStateException("Parking spot is already occupied.");
        }
        this.vehicle = v;
        this.isEmpty = false;
    }

    @Override
    public void removeVehicle() {
        if (isEmpty) {
            throw new IllegalStateException("Parking spot is already empty.");
        }
        this.vehicle = null;
        this.isEmpty = true;
    }
}
