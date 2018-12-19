package programas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class JumpIronsuitTest {
    @Test
    public void jumpTest() {
        JumpIronsuit jumpIronsuit = new JumpIronsuit();
        assertThat(jumpIronsuit.solution(6)).isEqualTo(2);
        assertThat(jumpIronsuit.solution(5)).isEqualTo(2);
        assertThat(jumpIronsuit.solution(5000)).isEqualTo(5);
    }

    @Test
    public void test() {

        List<String> a = new ArrayList<>();
        a.add("aaa");
        a.add("bbbb");
        String b = a.get(0);
        String c = a.get(0);
        assertThat(b==c).isTrue();

    }
}
