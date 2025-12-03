package racingcar;

import java.util.List;

public class Output {


    public void processGamePrint() {
        System.out.println("실행 결과");
    }

    public void gamePrint(List<Car> carList) {
        for (Car car : carList) {
            System.out.print(car.getCarName() + " : ");
            for (int i = 0; i < car.getDistance(); i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void winnerPrint(List<String> Winners) {
        System.out.print("최종 우승자 : ");;
        for (String Winner : Winners) {
            System.out.println(Winner+", ");
        }
    }
}
