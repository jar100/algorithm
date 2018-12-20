package programas.clear.numcountry;

import org.junit.Test;
import programas.BaseTest;

public class NumCountryTest extends BaseTest {

    @Test
    public void solution() {
        int input = 1;
        softly.assertThat(NumCountry.solution(input)).isEqualTo("1");

        input = 2;
        softly.assertThat(NumCountry.solution(input)).isEqualTo("2");

        input = 3;
        softly.assertThat(NumCountry.solution(input)).isEqualTo("4");

        input = 4;
        softly.assertThat(NumCountry.solution(input)).isEqualTo("11");

    }

    @Test
    public void test2() {
        System.out.println(NumCountry.solution(30));

    }
}