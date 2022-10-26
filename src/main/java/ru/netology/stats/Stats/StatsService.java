package ru.netology.stats.Stats;

public class StatsService {

    //#1 Сумма продаж
    public long salesAllAmount(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    //#2 Средняя сумма продаж
    public long averageSalesAmount(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    //#3 Месяц, пик продаж
    public int peakSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;

    }


    // # 4 Месяц, минимальные продажи
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //#5 Месяцы, ниже среднего
    public long monthBelowAverageSales(long[] sales) {
        int below = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSalesAmount(sales)) {
                below++;
            }
        }
        return below;
    }


    //#6 Месяцы, выше среднего
    public long monthAboveAverageSales(long[] sales) {
        int above = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSalesAmount(sales)) {
                above++;
            }
        }
        return above;
    }
}
