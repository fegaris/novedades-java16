package vehicle;

import java.math.BigDecimal;

public class VehicleFactory {

    public static MotorVehicle getRandomVehicle(){
        var randomNum = new BigDecimal(String.valueOf((Math.random() * 100) % 2));
        if(randomNum.intValue() == 0) {
            return new Car();
        } else {
            return new Truck();
        }
    }

    public static MotorVehicle createCar() {
        return new Car();
    }


}
