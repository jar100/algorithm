package programas.printer;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class PrinterTest extends BaseTest {

    @Test
    public void solution() {
        softly.assertThat(Printer.solution(new int[]{2, 1, 3, 2}, 2)).isEqualTo(1);
        softly.assertThat(Printer.solution(new int[]{1, 1, 9, 1, 1, 1}, 0)).isEqualTo(5);
    }
}