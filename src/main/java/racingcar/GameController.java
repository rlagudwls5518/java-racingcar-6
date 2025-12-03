package racingcar;

import java.util.List;

public class GameController {
    private final List<Car> carList;
    private final NumberGenerator numberGenerator;
    private final String tryCount;
    private final Output output;

    public GameController(List<Car> carList, NumberGenerator numberGenerator, String tryCount, Output output) {
        this.carList = carList;
        this.numberGenerator = numberGenerator;
        this.output = output;
        tryCountValidator(tryCount);
        this.tryCount = tryCount;
    }

    private void tryCountValidator(String countNumber) {
        if (countNumber.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (Integer.parseInt(countNumber) == 0) {
            throw new IllegalArgumentException();
        }
    }

    public void gameRunning() {
        output.processGamePrint();

        for (int i = 0; i < Integer.parseInt(tryCount); i++) {
            oneGame();
            output.gamePrint(carList);
        }
        GameResult result = new GameResult(carList);
        List<String> winners = result.gameResult();
        output.winnerPrint(winners);
    }

    private void oneGame() {
        for (Car car : carList) {
            int gobackNumber = numberGenerator.RandomNumberGenerator();
            if (gobackNumber >= 4) {
                car.moveCar();
            }
        }
    }


}
