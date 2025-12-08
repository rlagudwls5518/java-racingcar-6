package racingcar.model;


public class Service {
    private final GameController gameController;

    public Service(GameController gameController) {
        this.gameController = gameController;
    }

    public Cars tryGame(Cars carList) {
        gameController.oneGame(carList);
        return carList;
    }

    public Cars endGame(Cars carList) {
        GameResultCalculator result = new GameResultCalculator(carList);
        return result.winnerPlayers();
    }
}
