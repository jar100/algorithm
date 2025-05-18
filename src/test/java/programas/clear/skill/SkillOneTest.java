package programas.clear.skill;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SkillOneTest {
    SkillOne skillOne = new SkillOne();
    @Test
    public void name() {
        assertThat(skillOne.solution(new int[]{1,3,2,5,4}, 9)).isEqualTo(3);
    }

    @Test
    public void name2() {
        assertThat(skillOne.solution(new int[]{2,2,3,3}, 10)).isEqualTo(4);
    }
}