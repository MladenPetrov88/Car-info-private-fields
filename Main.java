package Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        car.setBrand("Chevrolet");
        car.setModel("Impala");
        car.setHorsepower(390);

        System.out.println(String.format("The car is %s %s - %d HP", car.getBrand(), car.getModel(), car.getHorsepower()));
    }
}
