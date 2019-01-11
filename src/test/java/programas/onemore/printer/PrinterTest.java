package programas.onemore.printer;

import org.junit.Test;
import programas.BaseTest;

public class PrinterTest extends BaseTest {
    @Test
    public void solution() {
        long start = System.currentTimeMillis();
        softly.assertThat(Printer.solution(new int[]{1, 1, 9, 1, 1, 1}, 0)).isEqualTo(5);
        softly.assertThat(Printer.solution(new int[]{1, 1, 1, 1, 1, 1}, 0)).isEqualTo(1);
        softly.assertThat(Printer.solution(new int[]{2, 1, 3, 2}, 2)).isEqualTo(1);
        softly.assertThat(Printer.solution(new int[]{1, 1, 5, 1, 1, 1}, 0)).isEqualTo(5);
        softly.assertThat(Printer.solution(new int[]{1, 1, 5, 7, 4, 9, 1, 1
                , 5, 7, 4, 9, 1, 1, 5, 7, 4, 9
                , 1, 1, 5, 7, 4, 9, 1, 1, 5, 7, 4
                , 9, 1, 1, 5, 7, 4, 9}, 0)).isEqualTo(27);
        long time = System.currentTimeMillis();
        System.out.println(time - start);
    }


    @Test
    public void solutionOthers() {
        long start = System.currentTimeMillis();
        softly.assertThat(Printer.solutionOthers(new int[]{2, 1, 3, 2}, 2)).isEqualTo(1);
        softly.assertThat(Printer.solutionOthers(new int[]{1, 1, 9, 1, 1, 1}, 0)).isEqualTo(5);
        softly.assertThat(Printer.solutionOthers(new int[]{1, 1, 1, 1, 1, 1}, 0)).isEqualTo(1);
        softly.assertThat(Printer.solutionOthers(new int[]{1, 1, 5, 1, 1, 1}, 0)).isEqualTo(5);
        softly.assertThat(Printer.solutionOthers(new int[]{1, 1, 5, 7, 4, 9, 1, 1
                , 5, 7, 4, 9, 1, 1, 5, 7, 4, 9
                , 1, 1, 5, 7, 4, 9, 1, 1, 5, 7, 4
                , 9, 1, 1, 5, 7, 4, 9}, 0)).isEqualTo(27);
        long time = System.currentTimeMillis();
        System.out.println(time - start);
    }


}