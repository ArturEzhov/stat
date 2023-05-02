package ru.netology.stats;
public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
     }
     public long average(long[] sales) {
        return sum(sales) / sales.length;
     }
     public int monthMaximalSale(long[] sales) {
        int monthMaximal = 0;

         for (int i = 0; i < sales.length; i++) {
             if (sales[i] >= sales[monthMaximal]) {
                monthMaximal = i;
             }
         }
         return monthMaximal + 1;
     }
    public int monthMinimalSale(long[] sales) {
        int monthMinimal = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimal]) {
                monthMinimal = i;
            }
        }
        return monthMinimal + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }

        }
        return counter;

    }
    public int monthHigherAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }

        }
        return counter;

    }

}
