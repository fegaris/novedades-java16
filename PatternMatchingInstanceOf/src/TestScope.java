import vehicle.Car;
import vehicle.Truck;
import vehicle.VehicleFactory;

/**
 * En este ejemplo se esta probando como afecta tener una variable con el mismo nombre en distintos ambitos
 */
public class TestScope {
    //Creamos una variable de tipo Truck para que nos devuelva un mensaje distinto
    private static final Truck c = new Truck();

    public static void main (String [] args){
        //Creamos dos objetos del mismo tipo para que entren en los dos ifs
        var car1 = VehicleFactory.createCar();
        var car2 = VehicleFactory.createCar();


        if(car1 instanceof Car c && c.checkFuel()){
            c.start();
        }
        if(car2 instanceof Car c){
            c.stop();
        }
        c.start();


    }

}
