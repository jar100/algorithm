package programas.clear.numcountry;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumCountryTest {

    @Test
    public void solution() {
        int input = 1;
        assertThat(NumCountry.solution(input)).isEqualTo("1");

        input = 2;
        assertThat(NumCountry.solution(input)).isEqualTo("2");

        input = 3;
        assertThat(NumCountry.solution(input)).isEqualTo("4");

        input = 4;
        assertThat(NumCountry.solution(input)).isEqualTo("11");

    }

    @Test
    public void test2() {
        System.out.println(NumCountry.solution(30));

    }
}