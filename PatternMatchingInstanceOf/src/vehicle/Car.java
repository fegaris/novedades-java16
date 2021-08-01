package vehicle;

public class Car implements MotorVehicle {
    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the car");
    }

    /**
     * Combrueba si hay combustible
     * @return devuelve true si hay combustible y false si no hay
     */
    public boolean checkFuel(){
        return true;
    }

}
