package racingCar.view;

public class OutputView {
    private static final String RESULT_HEAD = "실행 결과";
    private static final String INVALID_NAME_WARNING = "각 이름의 길이를 1 이상 5 이하로 입력해주세요.";

    public static void printResultTitle() {
        System.out.println(RESULT_TITLE);
    }

    private static void printRoundNum(int round) {
        System.out.println();
        if (round == ZERO_ROUND) {
            System.out.println(ROUND_START_TEXT);
            return;
        }
        System.out.println(round + ROUND_TAIL);
    }

    private static void printRoundInfo(List<String> names, List<Integer> positions) {
        for (int i = ZERO_INDEX; i < names.size(); i++) {
            System.out.println(names.get(i) + COLON_WRAPPED_WITH_SPACE
                    + positionToHyphens(positions.get(i)));
        }
    }

    public static void printEachRound(int round, List<String> names, List<Integer> positions) {
        printRoundNum(round);
        printRoundInfo(names, positions);
    }

    public static void printWinners(List<String> names) {
        System.out.println();
        System.out.print(PRINT_WINNERS_HEAD);
        System.out.print(createWinnerList(names));
        System.out.println(PRINT_WINNERS_TAIL);
    }

    private static String createWinnerList(List<String> names) {
        return String.join(", ", names);
    }

    private static String positionToHyphens(int position) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = ZERO_INDEX; i < position; i++) {
            stringBuilder.append(HYPHEN);
        }
        return stringBuilder.toString();
    }

    public static void printInvalidNameWarning() {
        System.out.println(INVALID_NAME_WARNING);
    }

}