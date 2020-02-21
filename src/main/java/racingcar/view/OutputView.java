package racingcar.view;

import racingcar.domain.Winners;
import racingcar.domain.car.Car;
import racingcar.domain.car.Cars;

public class OutputView {
    public static final String ENTER = System.lineSeparator();
    public static final String IS = " : ";
    private static final String MARK = "-";

    private OutputView() {
    }

    public static void printResult(Cars cars) {
        System.out.println(getResults(cars));
    }

    public static String getResults(Cars cars) {
        StringBuilder results = new StringBuilder();
        for (Car car : cars.getCars()) {
            results.append(getResult(car));
            results.append(ENTER);
        }
        return results.toString();
    }

    private static String getResult(Car car) {
        StringBuilder result = new StringBuilder();
        result.append(car.getName());
        result.append(IS);
        result.append(getLocationMarks(car));

        return result.toString();
    }

    private static String getLocationMarks(Car car) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < car.getLocation(); i++) {
            result.append(MARK);
        }
        return result.toString();
    }

    public static void printWinners(Winners winners) {
        System.out.println("우승자 명단");
        System.out.println(winners.getWinnerNames());
    }
}
