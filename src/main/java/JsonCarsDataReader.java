import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class JsonCarsDataReader {
    public static void main(String[] args) throws IOException {
        try {
            Scanner scanner = new Scanner(System.in);
            Inventory inventory = new Inventory();

            File carsFile = new File("D:/Java Projects/CarsJson/src/main/resources/Cars.json");
            File motorsFile = new File("D:/Java Projects/CarsJson/src/main/resources/Motors.json");
            ObjectMapper objectMapper = new ObjectMapper();

            List<Cars> car = objectMapper.readValue(carsFile, new TypeReference<List<Cars>>() {});
            for (int i = 0; i < car.size(); i++) {
                inventory.addCar(car.get(i).getModel(),car.get(i).getPrice(),car.get(i).getMaxSpeed(),car.get(i).getFuelBurn(),car.get(i).getNumberOfPassengers(),car.get(i).getCarSpec());
            }

            List<Motors> motor = objectMapper.readValue(motorsFile, new TypeReference<List<Motors>>() {});
            for (int i = 0; i < motor.size(); i++) {
                inventory.addMotor(motor.get(i).getModel(),motor.get(i).getPrice(),motor.get(i).getMaxSpeed(),motor.get(i).getFuelBurn(),motor.get(i).getSpec());
            }

//            System.out.print("Enter the car's spec : \nEnter body type: ");
//            String bodyType = scanner.nextLine();
//            System.out.print("Enter engine type: ");
//            String engineType = scanner.nextLine();
//            System.out.print("Enter transmission: ");
//            String transmission = scanner.nextLine();
//            System.out.print("Enter color: ");
//            String color = scanner.nextLine();
//
//            System.out.print("\nEnter the Motor's spec : \nEnter body type: ");
//            String MotorBodyType = scanner.nextLine();
//            System.out.print("Enter engine type: ");
//            String MotorEngineType = scanner.nextLine();
//            System.out.print("Enter transmission: ");
//            String MotorTransmission = scanner.nextLine();
//            System.out.print("Enter color: ");
//            String MotorColor = scanner.nextLine();
//
//            List<Cars> matchingCars = inventory.searchCar(bodyType, engineType, transmission, color);
//            List<Motors> matchingMotors = inventory.searchMotor(MotorBodyType, MotorEngineType, MotorTransmission, MotorColor);
//
//
//            System.out.println("\nPossible matches : \n"+matchingCars);
//            System.out.println("\n------------------------------\nPossible matches : \n"+matchingMotors);

            searchVehicle("Car", inventory);
            System.out.println("\n");
            searchVehicle("Motor",inventory);


            //ADDING VEHICLES TO THE INVENTORY
            System.out.println("\nAdding a vehicle : ");
            addVehicle("Car",inventory, "Z20",20000,200,120,5,"Bugatti","Fuel","Automatic","Carbon Black");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void addVehicle(String vehicleType,Inventory inventory,String model, int price, int maxSpeed, int fuelBurn, int passengersNum,String bodyType, String engineType, String transmission, String color ) {
        if (vehicleType == "Motor" | vehicleType == "Motor") {
            MotorSpec motorSpec = new MotorSpec(bodyType,engineType, transmission, color);
            inventory.addMotor(model,price,maxSpeed,fuelBurn,motorSpec);
        } else if (vehicleType == "Car" | vehicleType == "car"){
            CarSpec carSpec = new CarSpec(bodyType,engineType, transmission, color);
            inventory.addCar(model,price,maxSpeed,fuelBurn,passengersNum, carSpec);
        }
    }

    public static void searchVehicle(String vehicleType, Inventory inventory) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the car's spec : \nEnter body type: ");
        String bodyType = scan.nextLine();
        System.out.print("Enter engine type: ");
        String engineType = scan.nextLine();
        System.out.print("Enter transmission: ");
        String transmission = scan.nextLine();
        System.out.print("Enter color: ");
        String color = scan.nextLine();
        if (vehicleType == "Car" | vehicleType == "car") {
            List<Cars> matchingCars = inventory.searchCar(bodyType, engineType, transmission, color);
            System.out.println("\nPossible matches : \n"+matchingCars);
        } else if (vehicleType == "Motor" | vehicleType == "motor") {
            List<Motors> matchingMotors = inventory.searchMotor(bodyType, engineType, transmission, color);
            System.out.println("\nPossible matches : \n"+matchingMotors);
        }
    }
}
