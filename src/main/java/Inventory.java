import java.util.*;

public class Inventory {

    private List<Cars> cars;
    private List<Motors> motors;

    public Inventory() {
        cars = new LinkedList<>();
        motors = new LinkedList<>();
    }

    public void addCar(String model, int price, int maxSpeed, int fuelBurn, int passengersNum, CarSpec spec) {
        Cars car = new Cars(model, price, maxSpeed, fuelBurn, passengersNum, spec);
        cars.add(car);
    }

    public void addMotor(String model, int price, int maxSpeed, int fuelBurn, MotorSpec motorSpec) {
        Motors motor = new Motors( model,  price,  maxSpeed,  fuelBurn,  motorSpec);
        motors.add(motor);
    }


    public Cars getCar(String model) {
        for (Iterator<Cars> i = cars.iterator(); i.hasNext();) {
            Cars car = i.next();
            if (car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }

    public Motors getMotor(String model) {
        for (Iterator<Motors> i = motors.iterator(); i.hasNext();) {
            Motors motor = i .next();
            if (motor.getModel().equals(model)) {
                return motor;
            }
        }
        return null;
    }

    public List<Cars> searchCar(String bodyType, String engineType, String transmission, String color) {

        CarSpec spec = new CarSpec(bodyType, engineType, transmission, color);
        List<Cars> matches = new ArrayList<>();
        for (Iterator<Cars> i = cars.iterator(); i.hasNext();) {
            Cars car = i.next();
            if (spec.getBodyType() != null && !spec.getBodyType().equals("") && !spec.getBodyType().equals(car.getSpec().getBodyType())) {
                continue;
            }
            if (spec.getEngineType() != null && !spec.getEngineType().equals("") && !spec.getEngineType().equals(car.getSpec().getEngineType())) {
                continue;
            }
            if (spec.getTransmission() != null && !spec.getTransmission().equals("") && !spec.getTransmission().equals(car.getSpec().getTransmission())) {
                continue;
            }
            if (spec.getColor() != null && !spec.getColor().equals("") && !spec.getColor().equals(car.getSpec().getColor())) {
                continue;
            }
            matches.add(car);
        }
        return matches;
    }

    public List<Motors> searchMotor(String bodyType, String engineType, String transmission, String color) {

        MotorSpec spec = new MotorSpec(bodyType, engineType, transmission, color);
        List<Motors> matches = new ArrayList<>();
        for (Iterator<Motors> i = motors.iterator(); i.hasNext();) {
            Motors motor = i.next();
            if (spec.getBodyType() != null && !spec.getBodyType().equals("") && !spec.getBodyType().equals(motor.getSpec().getBodyType())) {
                continue;
            }
            if (spec.getEngineType() != null && !spec.getEngineType().equals("") && !spec.getEngineType().equals(motor.getSpec().getEngineType())) {
                continue;
            }
            if (spec.getTransmission() != null && !spec.getTransmission().equals("") && !spec.getTransmission().equals(motor.getSpec().getTransmission())) {
                continue;
            }
            if (spec.getColor() != null && !spec.getColor().equals("") && !spec.getColor().equals(motor.getSpec().getColor())) {
                continue;
            }
            matches.add(motor);
        }
        return matches;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "cars=" + cars +
                ", motors=" + motors +
                '}';
    }
}
