package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import racingcar.util.NameParsing;

public class CarFactory {

    public Cars createCars(String carNames) {
        NameParsing carNameParser = new NameParsing(carNames);
        List<Car> carList = new ArrayList<>();

        for (String carName : carNameParser.nameParser()) {
            carList.add(new Car(carName));
        }

        Cars cars = new Cars(carList);

        return cars;
    }
}
