package racingcar.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameParsing {
    private final String carNames;

    private static final String DELEMRTERS = ",";

    public NameParsing(String carNames) {
        this.carNames = carNames;
    }

    public List<String> nameParser() {
        return new ArrayList<>(Arrays.asList(carNames.split(DELEMRTERS)));
    }
}
