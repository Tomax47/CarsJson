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
            ObjectMapper objectMapper = new ObjectMapper();

            List<Cars> car = objectMapper.readValue(carsFile, new TypeReference<List<Cars>>() {});
            for (int i = 0; i < car.size(); i++) {
                inventory.addCar(car.get(i).getModel(),car.get(i).getPrice(),car.get(i).getMaxSpeed(),car.get(i).getFuelBurn(),car.get(i).getNumberOfPassengers(),car.get(i).getCarSpec());
            }

            System.out.print("Enter body type: ");
            String bodyType = scanner.nextLine();
            System.out.print("Enter engine type: ");
            String engineType = scanner.nextLine();
            System.out.print("Enter transmission: ");
            String transmission = scanner.nextLine();
            System.out.print("Enter color: ");
            String color = scanner.nextLine();

            List<Cars> matchingCars = inventory.search(bodyType, engineType, transmission, color);


            System.out.println("Possible matches : \n"+matchingCars);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
