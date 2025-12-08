package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class GameResultCalculator {

    private final Cars carList;

    public GameResultCalculator(Cars carList) {
        this.carList = carList;
    }

    public Cars winnerPlayers() {
        List<Car> winnerPlayers = new ArrayList<>();
        for (Car car : carList.getCars()) {
            if (maxDistance() == car.getDistance()) {
                winnerPlayers.add(car);
            }
        }
        Cars winners = new Cars(winnerPlayers);

        return winners;
    }

    private int maxDistance() {
        return carList.playerGetMaxDistance();
    }

}
