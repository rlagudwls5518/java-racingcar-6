package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingGame {


    public static void GameStart(String[] carName, int TryNum, Car[] car){
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
}
