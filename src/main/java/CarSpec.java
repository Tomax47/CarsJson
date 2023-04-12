public class CarSpec {
    private String bodyType;
    private String engineType;
    private String transmission;
    private String color;

    public CarSpec(){}
    public CarSpec(String bodyType, String engineType, String transmission, String color) {
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.transmission = transmission;
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarSpec{" +
                "bodyType='" + bodyType + '\'' +
                ", engineType='" + engineType + '\'' +
                ", transmission='" + transmission + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
