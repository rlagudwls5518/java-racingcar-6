package racingcar.view;


import racingcar.model.Car;
import racingcar.model.Cars;

public class Output {

    public void processGamePrint() {
        System.out.println("실행 결과");
    }

    public void gamePrint(Cars carList) {
        for (Car car : carList.getCars()) {
            System.out.print(car.getCarName() + " : ");
            for (int i = 0; i < car.getDistance(); i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void winnerPrint(Cars Winners) {
        System.out.print("최종 우승자 : ");
        ;
        for (Car car : Winners.getCars()) {
            System.out.println(car.getCarName() + ", ");
        }
    }
}
