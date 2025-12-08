package racingcar.controller;


import racingcar.model.CarFactory;
import racingcar.model.Cars;
import racingcar.model.GameController;
import racingcar.util.InputValidator;
import racingcar.model.NumberGenerator;
import racingcar.model.Service;
import racingcar.view.Input;
import racingcar.view.Output;

public class Controller {

    private final Input input;
    private final Output output;

    public Controller(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public void run() {

        String carNames = inputCarNames();
        int tryCount = inputTryNumber();
        Cars carsDto = createDto(carNames);

        GameController gameController = new GameController(new NumberGenerator());
        Service service = new Service(gameController);

        playGame(tryCount, service, carsDto);

    }

    private String inputCarNames() {
        return input.inputTextName();
    }

    private int inputTryNumber() {
        String tryCount = input.inputTextNumber();
        InputValidator.tryCountValidator(tryCount);
        return Integer.parseInt(tryCount);
    }

    private Cars createDto(String carNames) {
        CarFactory carFactory = new CarFactory();
        return carFactory.createCars(carNames);
    }

    private void playGame(int tryCount, Service service, Cars carsDto) {
        output.processGamePrint();
        for (int i = 0; i < tryCount; i++) {
            Cars gammingCars = service.tryGame(carsDto);
            output.gamePrint(gammingCars);
        }
        output.winnerPrint(service.endGame(carsDto));
    }
}
