public class Motors {

    private String model;
    private int price;
    private int maxSpeed;
    private int fuelBurn;

    private MotorSpec motorSpec;


    Motors(){}

    Motors(String model, int price, int maxSpeed, int fuelBurn, MotorSpec motorSpec) {
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelBurn = fuelBurn;
        this.motorSpec = motorSpec;
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

    public MotorSpec getSpec() {
        return motorSpec;
    }

    public void setMotorSpec(MotorSpec motorSpec) {
        this.motorSpec = motorSpec;
    }

    @Override
    public String toString() {
        return "Motors{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelBurn=" + fuelBurn +
                ", motorSpec=" + motorSpec +
                '}';
    }
}
