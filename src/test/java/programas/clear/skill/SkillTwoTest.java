package programas.clear.skill;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SkillTwoTest {
    SkillTwo skillTwo = new SkillTwo();

    @Test
    public void name() {
        assertThat(skillTwo.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"kiki", "eden"})).isEqualTo("leo");
    }

    @Test
    public void name2() {
        assertThat(skillTwo.solution(new String[]{"leo", "kiki", "eden", "leo"},
                new String[]{ "eden", "leo","leo"})).isEqualTo("kiki");
    }
}