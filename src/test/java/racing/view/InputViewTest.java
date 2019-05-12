package racing.view;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class InputViewTest {

    @Test(expected = IllegalArgumentException.class)
    public void 구분자_쉼표_에러_확인() {
        InputView.checkIdentifier("andole:baedi");
    }

    @Test
    public void 정상_구분자() {
        try {
            String inputString = "andole,baedi";
            ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
            System.setIn(input);
            assertEquals(inputString, InputView.inputCarNames());
        } finally {
            System.setIn(System.in);
        }
    }

    @Test
    public void 반복횟수_체크() {
        try {
            ByteArrayInputStream input = new ByteArrayInputStream("5".getBytes());
            System.setIn(input);
            assertEquals(5, InputView.inputRepeatNumber().getNumber());
        } finally {
            System.setIn(System.in);
        }
    }
}