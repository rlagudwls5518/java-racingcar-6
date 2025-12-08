package racingcar.model;

import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public int playerGetMaxDistance() {
        int maxDistance = 0;
        for (Car car : cars) {
            if (maxDistance < car.getDistance()) {
                maxDistance = car.getDistance();
            }
        }
        return maxDistance;
    }
}
