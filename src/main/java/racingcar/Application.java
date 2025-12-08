package racingcar;

import racingcar.controller.Controller;
import racingcar.view.Input;
import racingcar.view.Output;

public class Application {
    public static void main(String[] args) {

        Input input = new Input();
        Output output = new Output();
        Controller controller = new Controller(input, output);
        controller.run();
    }
}
