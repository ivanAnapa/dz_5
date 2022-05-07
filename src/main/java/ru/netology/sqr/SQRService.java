package ru.netology.sqr;

public class SQRService {
    public int getTheNumberOfValuesIncludedInTheRange(int valueFrom, int valueTo) {
        int numberOfIncludedValues = 0;
        for (int i = 10; i <= 99; i++) {
            if (((i * i) >= valueFrom) && ((i * i) <= valueTo)) {
                numberOfIncludedValues++;
            }
        }
        return numberOfIncludedValues;
    }

}
