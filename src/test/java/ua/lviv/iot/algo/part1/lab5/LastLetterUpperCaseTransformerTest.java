package ua.lviv.iot.algo.part1.lab5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class LastLetterUpperCaseTransformerTest {

    @Test
    public void testTransformText() {
        String input = "This text is for testing the correctness of the method";
        String expected = "ThiS texT iS foR testinG thE correctnesS oF thE methoD";
        LastLetterUpperCaseTransformer transformer = new LastLetterUpperCaseTransformer();
        String actualOutput = transformer.transformText(input);
        Assertions.assertEquals(expected, actualOutput);
    }

    @Test
    public void testTransformTextWithEmptyInput() {
        String input = "";
        String expected = "";
        LastLetterUpperCaseTransformer transformer = new LastLetterUpperCaseTransformer();
        String actualInput = transformer.transformText(input);
        Assertions.assertEquals(expected, actualInput);
    }
}