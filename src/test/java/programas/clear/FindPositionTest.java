package programas.clear;

import org.junit.jupiter.api.Test;
import programas.clear.FindPosition;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;


public class FindPositionTest {

    @Test
    public void 데시짜르기() {
        String input = "(1,3)-(2,5)";
        String[] inputSplit = FindPosition.divisionDesh(input);
       assertThat(inputSplit[0]).isEqualTo("(1,3)");
        assertThat(inputSplit[1]).isEqualTo("(2,5)");

    }

    @Test
    public void 계산하기() {
        String input = "(1,1)-(2,2)";
        String[] inputSplit = FindPosition.divisionDesh(input);
        assertThat(FindPosition.calculation(FindPosition.divisionDesh(input))).isEqualTo(1.414, offset(0.001));
    }

    @Test
    public void 계산스() {
        String input = "(1,1)-(2,2)";
        String[] input2 = FindPosition.divisionDesh(input);

        System.out.println(input2[0]);
        System.out.println(input2[1]);

    }

    @Test
    public void 계산스2() {
        String input1 = "(1,1)";
        String input2 = "(2,2)";
        String fist = FindPosition.divisionComma(input1);
        String second = FindPosition.divisionComma(input2);
        System.out.println(fist);
        System.out.println(second);

    }

}
