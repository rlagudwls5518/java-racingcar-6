package racingcar;

import java.util.List;

public class Controller {

    private final Input input;
    private final Output output;

    public Controller(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public void run(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = input.inputText();

        System.out.println("시도할 회수는 몇회인가요?");
        String tryCount = input.inputText();

        NameParsing nameParsing = new NameParsing(carNames);
        List<String> parsedCars = nameParsing.carNameParser();

        Cars cars =  new Cars(parsedCars);
        List<Car> carList = cars.getCars();
        NumberGenerator numberGenerator = new NumberGenerator();

        GameController gameController = new GameController(carList, numberGenerator, tryCount, output);
        gameController.gameRunning();




    }
}
