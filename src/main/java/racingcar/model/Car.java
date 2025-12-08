package racingcar.model;

public class Car {
    private final String carName;
    private int distance = 0;

    public Car(String carName) {
        carNameValidator(carName);
        this.carName = carName;
    }

    private void carNameValidator(String carName) {
        if(carName == null || carName.isEmpty()){
            throw new IllegalArgumentException();
        }
        if(carName.length() > 5){
            throw new IllegalArgumentException();
        }
    }

    public void moveCar(){
        distance++;
    }
    public int getDistance(){
        return distance;
    }
    public String getCarName(){
        return carName;
    }
}
