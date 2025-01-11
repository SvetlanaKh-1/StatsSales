package ru.netology.StatsService.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int belowAverageSales(long[] sales) {
        long average = averageSales(sales);
        int belowAvMonth = 0;
        for (long sale : sales) {
            if (sale < average) {
                belowAvMonth += 1;
            }
        }
        return belowAvMonth;
    }

    public int aboveAverageSales(long[] sales) {
        long average = averageSales(sales);
        int aboveAvMonth = 0;
        for (long sale : sales) {
            if (sale > average) {
                aboveAvMonth += 1;
            }
        }
        return aboveAvMonth;
    }
}