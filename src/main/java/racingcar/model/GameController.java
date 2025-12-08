package racingcar.model;


public class GameController {
    private final NumberGenerator numberGenerator;

    public GameController(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;

    }

    public void oneGame(Cars carList) {

        for (Car car : carList.getCars()) {
            int gobackNumber = numberGenerator.RandomNumberGenerator();
            if (gobackNumber >= 4) {
                car.moveCar();
            }
        }
    }

}
