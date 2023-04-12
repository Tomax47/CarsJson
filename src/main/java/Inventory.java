import java.util.*;

public class Inventory {

    private List<Cars> cars;

    public Inventory() {
        cars = new LinkedList<>();
    }

    public void addCar(String model, int price, int maxSpeed, int fuelBurn, int passengersNum, CarSpec spec) {
        Cars car = new Cars(model, price, maxSpeed, fuelBurn, passengersNum, spec);
        cars.add(car);
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

    public List<Cars> search(String bodyType, String engineType, String transmission, String color) {

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

}
