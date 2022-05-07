package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/limitsAndExpectedForSQRServiceTest.csv"})
    public void checkSQRService(int valueFrom, int valueTo, int expectedResult) {
        SQRService service = new SQRService();
        int actualResult = service.getTheNumberOfValuesIncludedInTheRange(valueFrom, valueTo);
        Assertions.assertEquals(expectedResult, actualResult, "Количество значений, входящих в диапазон от "
                + valueFrom + "  до " + valueTo + " не соответствует ожидаемому");
    }
}
