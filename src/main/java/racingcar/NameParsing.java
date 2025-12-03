package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameParsing {
    private final String carNames;
    public NameParsing(String carNames) {
        this.carNames = carNames;
    }

    public List<String> carNameParser(){
        List<String> cars = new ArrayList<>(Arrays.asList(carNames.split(",")));
        return cars;
    }
}
