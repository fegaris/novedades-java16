package vehicle;

public class Truck implements MotorVehicle {
    @Override
    public void start() {
        System.out.println("Start the truck");
    }

    @Override
    public void stop() {
        System.out.println("Stop the truck");
    }
}
