package ru.netology.stats.Stats;

public class StatsService {

    //#1 Сумма продаж
    public long salesAllAmount(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //#2 Средняя сумма продаж
    public long averageSalesAmount(long[] sales) {
        return salesAllAmount(sales) / sales.length;
    }

    //#3 Месяц, пик продаж
    public int peakSales(long[] sales) {
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                month = i;
            }
        }
        return month + 1;
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
    public int monthBelowAverageSales(long[] sales) {
        long average = averageSalesAmount(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }


    //#6 Месяцы, выше среднего
    public int monthAboveAverageSales(long[] sales) {
        long average = averageSalesAmount(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }
}
