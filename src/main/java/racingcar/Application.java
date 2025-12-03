package racingcar;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        Input input = new Input();
        Output output = new Output();
        Controller controller = new Controller(input, output);
        controller.run();
    }
}
