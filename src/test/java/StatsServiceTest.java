import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    void totalSalesSum() {
        int[] input = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.totalSales(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageMonthlySales() {
        int[] input = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.monthlyAverageSales(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxSalesMonth() {
        int[] input = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minSalesMonth() {
        int[] input = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void belowAverageSalesAmount() {
        int[] input = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.belowAverageSales(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void aboveAverageSalesAmount() {
        int[] input = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.aboveAverageSales(input);
        Assertions.assertEquals(expected, actual);
    }
}
