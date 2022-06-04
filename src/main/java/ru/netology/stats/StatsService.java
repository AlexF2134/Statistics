package ru.netology.stats;

public class StatsService {


    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    }


    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public int findAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

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


    public int monthLowerAverage(int[] sales) {
        int totalMonths = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        int findAverage = (calculateSum(sales) / sales.length);
        for (long sale : sales) {
            if (sale < findAverage) {
                totalMonths = totalMonths + 1;
            }
            month = month + 1;
        }
        return totalMonths;
    }


    public int monthHigherAverage(int[] sales) {
        int totalMonths = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        int findAverage = (calculateSum(sales) / sales.length);
        for (long sale : sales) {
            if (sale > findAverage) {
                totalMonths = totalMonths + 1;
            }
            month = month + 1;
        }
        return totalMonths;
    }
}