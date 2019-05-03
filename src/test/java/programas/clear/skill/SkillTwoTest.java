package programas.clear.skill;

import org.junit.Test;
import programas.BaseTest;

public class SkillTwoTest extends BaseTest {
    SkillTwo skillTwo = new SkillTwo();

    @Test
    public void name() {
        softly.assertThat(skillTwo.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"kiki", "eden"})).isEqualTo("leo");
    }

    @Test
    public void name2() {
        softly.assertThat(skillTwo.solution(new String[]{"leo", "kiki", "eden", "leo"},
                new String[]{ "eden", "leo","leo"})).isEqualTo("kiki");
    }
}