package racingcar;

import org.mockito.internal.matchers.Null;

public class Car {
    private String name;
    private int position=0;

    public Car(String name){
        this.name = name;
    }
    public void getName(){

        if(name.isEmpty()){
            throw new IllegalArgumentException("에러메시지");
        } else if (name.length()>5) {
            throw new IllegalArgumentException("자동차 이름은 1~5자여야 합니다.");
        }
    }
    public void getPosition(){

        if(position <= 0){
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }
    }



}
