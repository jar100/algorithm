package programas.clear.skill;

import org.junit.Test;
import programas.BaseTest;

public class SkillOneTest extends BaseTest {
    SkillOne skillOne = new SkillOne();
    @Test
    public void name() {
        softly.assertThat(skillOne.solution(new int[]{1,3,2,5,4}, 9)).isEqualTo(3);
    }

    @Test
    public void name2() {
        softly.assertThat(skillOne.solution(new int[]{2,2,3,3}, 10)).isEqualTo(4);
    }
}