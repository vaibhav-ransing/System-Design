package DesignPatterhn.strategyDP.Without;

class Vehicle {
    public void  drive(){
        System.out.println("This is default drive");
    }
}


class SprotyVehicle extends Vehicle{

    @Override
    public void drive() {
//        super.drive();
        System.out.println("Special drive");
    }
}

class PassengerVehicle extends  Vehicle{

    @Override
    public void drive() {
        // default method of Vehicle class
        super.drive();
    }
}

class OffRoadVehicle extends  Vehicle{


    // The drive method for SportyVehicle and OffRoad is same
        // this is code duplication
    // To solve this
        // Create a interface Drive
        // then create 2 classes SpecialDrive and RegalDrive
            // both will implement Drive interface
    // Now In Vehicle class
        // Inject the Drive object
    // Now when Vehicle is extended by other classes they will have to pass the object of
        // SpecialDrive or RegualDrive
        // this will make it more dynamic
    @Override
    public void drive() {
        System.out.println("Special drive");
    }
}
