package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] carName =  Console.readLine().split(",");

        System.out.println("시도할 회수는 몇회인가요?");
        int TryNum = Integer.parseInt(Console.readLine());

        //예외처리
        EceptionCheck(carName, TryNum);

        Car[] car = new Car[carName.length];
        for(int i=0; i< carName.length; i++){
            car[i] = new Car(carName[i]);
        }
        RacingGame(carName, TryNum, car);
        PrintGame(carName, car);


    }
    public static void EceptionCheck(String[] carName, int TryNum){
        for(String n : carName){
            if(n.isEmpty()){
                throw new IllegalArgumentException("비어있습니다");
            }

            if (n.length() > 5) {
                throw new IllegalArgumentException("5자 이하로 입력하세요");
            }
        }

        if(TryNum <= 0){
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }
    }
    public static void RacingGame(String[] carName, int TryNum, Car[] car){
        System.out.println("실행 결과");
        for(int i=0; i<TryNum; i++){
            for(int j=0; j< carName.length; j++){
                int randomNumber = Randoms.pickNumberInRange(0, 9);
                if(randomNumber>=4){
                    car[j].move();
                }
                car[j].printName();
                System.out.print(" : ");
                car[j].printPosition();
            }
            System.out.println();
        }
    }
    public static void PrintGame(String[] carName,Car[] car){
        System.out.print("최종 우승자 : ");
        int max = 0;
        for(int i=0; i< carName.length; i++){
            if(max < car[i].getPosition()){
                max = car[i].getPosition();
            }
        }
        boolean first = true;

        for(int i=0; i< carName.length; i++){
            if(max == car[i].getPosition()){
                if (!first) {
                    System.out.print(", ");
                }
                car[i].printName();
                first = false;
            }
        }
    }
}
