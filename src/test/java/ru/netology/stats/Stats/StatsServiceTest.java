package ru.netology.stats.Stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void GetSalesAllAmount() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 180;
        long actualAmount = service.salesAllAmount(allSales);

        Assertions.assertEquals(expectedAmount, actualAmount);

    }

    @Test
    public void GetaverageSalesAmount() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSails = 15;
        long actualAverageSails = service.averageSalesAmount(allSales);

        Assertions.assertEquals(expectedAverageSails, actualAverageSails);

    }

    @Test
    public void GetPeakSales() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedPeakSales = 8;
        long actualPeakSales = service.peakSales(allSales);

        Assertions.assertEquals(expectedPeakSales, actualPeakSales);
    }

    @Test
    public void GetMinSales() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinSales = 9;
        long actualMinSales = service.minSales(allSales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void GetMonthBelowAwerage() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonthBelowAwerage = 5;
        long actualMonthBelowAwerage = service.monthBelowAverageSales(allSales);
        Assertions.assertEquals(expectedMonthBelowAwerage, actualMonthBelowAwerage);
    }

    @Test
    public void GetMonthAboveAwerage() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonthAboveAwerage = 4;
        long actualMonthAboveAwerage = service.monthAboveAverageSales(allSales);
    }
}
