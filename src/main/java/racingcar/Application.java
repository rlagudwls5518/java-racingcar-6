package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] carName =  Console.readLine().split(",");

        System.out.println("시도할 회수는 몇회인가요?");
        int TryNum = Integer.parseInt(Console.readLine());

        Car[] car = new Car[carName.length];
        for(int i=0; i< carName.length; i++){car[i] = new Car(carName[i]);}

        RacingGame.GameStart(carName, TryNum, car);
        View.PrintGame(carName, car);

    }
}
