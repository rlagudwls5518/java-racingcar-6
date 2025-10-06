package racingcar;

import org.mockito.internal.matchers.Null;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name must not be null or blank");
        }
        this.name = name;
    }
    public void move(){
        position++;
    }
    public int getPosition(){
        return position;
    }

    public void printName(){
        System.out.print(name);
    }
    public void printPosition(){
        for(int i=0; i<position; i++){
            System.out.print("-");
        }
        System.out.println();
    }

}
