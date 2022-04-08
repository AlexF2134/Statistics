package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] totalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(totalSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findAverage() {
        StatsService service = new StatsService();
        int[] totalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateSum(totalSales) / totalSales.length;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldChoseMax() {
        StatsService service = new StatsService();
        long[] totalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(totalSales);

        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldChoseMinSales() {
        StatsService service = new StatsService();
        long[] totalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(totalSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCountMonthLowerAverage() {
        StatsService service = new StatsService();
        int[] totalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        int actual = service.monthLowerAverage(totalSales);

        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldCountMonthHigherAverage() {
        StatsService service = new StatsService();
        long[] totalSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.minSales(totalSales);

        assertEquals(expected, actual);
    }
}