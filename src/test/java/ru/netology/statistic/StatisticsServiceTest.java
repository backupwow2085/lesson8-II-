package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenAllValuesAreSame() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {7, 7, 7, 7, 7};
        long expected = 7;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenArrayContainsNegativeValues() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-3, -5, -1, -7};
        long expected = -1;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenArrayHasOneElement() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {100};
        long expected = 100;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}