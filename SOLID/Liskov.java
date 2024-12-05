public class Liskov {

    static interface Bike {
        void turnOnEngine();

        void accelerate();
    }

    static class MotoBike implements Bike {

        boolean isEngineOn;
        int speed;

        MotoBike() {
            this.isEngineOn = false;
            this.speed = 0;
        }

        public void turnOnEngine() {
            System.out.println("Engine on");

            this.isEngineOn = true;
        }

        public void accelerate() {
            System.out.println("Acceletared");
            speed = speed + 10;
        }

        public void printSpeed() {
            System.out.println(this.speed);
        }

    }

    // we narrowed down the functionality of parent
    // there is no isEngineOn variable
    // if some program uses bikeObject.isEngineOne then it will throw error.
    static class cycle implements Bike {
        int speed;

        cycle() {
            this.speed = 0;
        }

        @Override
        public void turnOnEngine() {
            System.out.println("Engine Exception");
            throw new AssertionError("There is no engine");
        }

        @Override
        public void accelerate() {
            System.out.println("Acceleated");
            this.speed += 10;
        }

    }

    public static void helper(Bike bike) {
        bike.turnOnEngine();
        bike.accelerate();
        bike.accelerate();
    }

    public static void main(String[] args) {
        Bike motor = new MotoBike();
        helper(motor);

        // this will break the functionaliy of helper
        Bike cycle = new cycle();
        helper(cycle);
    }

}
