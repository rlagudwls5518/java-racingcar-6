package racingcar;

import java.util.ArrayList;
import java.util.List;

public class GameResult {

    private final List<Car> carList;

    public GameResult(List<Car> carList) {
        this.carList = carList;
    }


    public List<String> gameResult(){
        int maxDistance = playerGetMaxDistance();
        return winnerPlayers(maxDistance);
    }

    private int playerGetMaxDistance(){
        int maxDistance = 0;
        for(Car car : carList){
            if(maxDistance < car.getDistance())
                maxDistance = car.getDistance();
        }
        return maxDistance;
    }

    private List<String> winnerPlayers(int maxDistance){
        List<String> winnerPlayers = new ArrayList<>();
        for(Car car : carList){
            if(playerGetMaxDistance() == maxDistance){
                winnerPlayers.add(car.getCarName());
            }
        }
        return winnerPlayers;
    }
}
