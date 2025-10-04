package racingcar;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Scanner scanner = new Scanner(System.in);


        String[] carName = scanner.nextLine().split(",");

        Car[] cars = new Car[carName.length];

        for(int i=0; i < carName.length; i++){
            cars[i] = new Car(carName[i]);
            cars[i].getName();
        }

        int PositionNum = scanner.nextInt();






    }
}
