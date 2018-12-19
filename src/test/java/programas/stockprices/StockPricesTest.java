package programas.stockprices;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class StockPricesTest {

    @Test
    public void solutionTest() {
        assertThat(StockPrices.solution(new int[]{498,501,470,489})).isEqualTo(new int[]{2, 1, 1, 0});
    }
}
