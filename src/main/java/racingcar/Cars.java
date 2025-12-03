package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<String> cars;

    public Cars(List<String> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        List<Car> carList = new ArrayList<>();
        for(String carName : cars){
            carList.add(new Car(carName));
        }

        return  carList;
    }
}
