package ru.netology.stats;

public class StatsService {

    //сумма всех продаж
    public int SumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    //средняя сумма продаж в месяц
    public int averageAmount(int[] sales) {
        int result = SumSales(sales) / sales.length;
        return result;
    }

    //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(int[] sales) {
        int maxMonth = 0; //

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int countMonthMin(int[] sales) {
        int average = averageAmount(sales);
        int countMonth = 0;


        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                countMonth++;
            }
        }
        return countMonth;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int countMonthMax(int[] sales) {
        int average = averageAmount(sales);
        int countMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                countMonth++;
            }
        }
        return countMonth;
    }
}
