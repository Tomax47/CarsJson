import java.util.List;

public class Cars {
    private String model;
    private int price;
    private int maxSpeed;
    private int fuelBurn;
    private int numberOfPassengers;
    private CarSpec carSpec;


    public Cars() {}


    public Cars(String model, int price, int maxSpeed, int fuelBurn, int passengersNum, CarSpec spec) {
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelBurn = fuelBurn;
        this.numberOfPassengers = passengersNum;
        this.carSpec = spec;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuelBurn() {
        return fuelBurn;
    }

    public void setFuelBurn(int fuelBurn) {
        this.fuelBurn = fuelBurn;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public CarSpec getCarSpec() {
        return carSpec;
    }

    public void setCarSpec(CarSpec carSpec) {
        this.carSpec = carSpec;
    }


    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelBurn=" + fuelBurn +
                ", numberOfPassengers=" + numberOfPassengers +
                ", carSpec=" + carSpec +
                '}';
    }

    public CarSpec getSpec() {
        return carSpec;
    }
}
