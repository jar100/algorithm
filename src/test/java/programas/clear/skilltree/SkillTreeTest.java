package programas.clear.skilltree;

import org.junit.Test;
import programas.BaseTest;

public class SkillTreeTest extends BaseTest {
    private SkillTree skillTree = new SkillTree();

    @Test
    public void name() {

        softly.assertThat(skillTree.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"})).isEqualTo(2);
    }

    @Test
    public void name1() {
        String a = "cb";
        String b = "cbd";
        System.out.println(b.startsWith(a));
    }
}