package DesignPatterhn.strategyDP.with;

public class With {

    static interface Drive {
        public void drive();
    }

    static class SuperDrive implements Drive {

        @Override
        public void drive() {
            System.out.println("This is special Drive");
        }
    }

    static class RegularDrive implements Drive {

        @Override
        public void drive() {
            System.out.println("This is special Drive");
        }
    }

    /* Now above we have defined Drive
        We will inject Drive object into our Vehicle class
            Which later will be extended by OffRoad Sporty and passenger Vehicle classes
    */
    static class Vehicle {
        Drive drive;

        Vehicle(Drive drive) {
            this.drive = drive;
        }
    }

    static class OffRoadVehicle extends Vehicle {

        /* We passed SuperDrive Object to class*/
        OffRoadVehicle() {
            super(new SuperDrive());
        }
    }

    static class SportyVehicle extends Vehicle {

        /* We passed SuperDrive Object to class*/
        SportyVehicle() {
            super(new SuperDrive());
        }
    }

    static class PassengerVehicle extends Vehicle {

        /* We passed SuperDrive Object to class*/
        PassengerVehicle() {
            super(new SuperDrive());
        }
    }

}
