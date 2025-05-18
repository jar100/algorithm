package programas.clear.skilltree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SkillTreeTest {
    private SkillTree skillTree = new SkillTree();

    @Test
    public void name() {

        assertThat(skillTree.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"})).isEqualTo(2);
    }

    @Test
    public void name1() {
        String a = "cb";
        String b = "cbd";
        System.out.println(b.startsWith(a));
    }
}