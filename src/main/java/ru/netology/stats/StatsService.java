package ru.netology.stats;

public class StatsService {
    public int totalSales(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];

        }
        return sum;
    }

    public int monthlyAverageSales(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];

        }
        int average = sum / input.length;
        return average;
    }

    public int maxSales(int[] input) {
        int maxMonth = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] >= input[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] input) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < input.length; i++) {
            if (input[i] <= input[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAverageSales(int[] input) {
        StatsService service = new StatsService();
        int average = service.monthlyAverageSales(input);
        int counter = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] < average) {
                counter = counter + 1;

            }

        }
        return counter;
    }

    public int aboveAverageSales(int[] input) {
        StatsService service = new StatsService();
        int average = service.monthlyAverageSales(input);
        int counter = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > average) {
                counter = counter + 1;

            }

        }
        return counter;
    }


}
