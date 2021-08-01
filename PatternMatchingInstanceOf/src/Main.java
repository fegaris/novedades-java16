import vehicle.Car;
import vehicle.MotorVehicle;
import vehicle.Truck;
import vehicle.VehicleFactory;

public class Main {

    public static void main (String[] args) {
        var vehicle1 = VehicleFactory.getRandomVehicle();
        var vehicle2 = VehicleFactory.getRandomVehicle();

        if(vehicle1 instanceof Car c){
            c.start();
        }
        if (vehicle2 instanceof Truck t) {
            t.start();
        }

    }

}
