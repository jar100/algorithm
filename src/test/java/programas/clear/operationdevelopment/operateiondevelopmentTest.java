package programas.clear.operationdevelopment;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class operateiondevelopmentTest {

    @Test
    public void solution() {
        assertThat(Operateiondevelopment.solution(new int[]{93,30,55},	new int[]{1,30,5})).isEqualTo(new int[]{2,1});
    }
}