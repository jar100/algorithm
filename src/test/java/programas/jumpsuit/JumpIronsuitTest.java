package programas.jumpsuit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.Assert.*;

public class JumpIronsuitTest {
    @Test
    public void jumpTest() {
        JumpIronsuit jumpIronsuit = new JumpIronsuit();
        assertThat(jumpIronsuit.solution(6)).isEqualTo(2);
        assertThat(jumpIronsuit.solution(5)).isEqualTo(2);
        assertThat(jumpIronsuit.solution(5000)).isEqualTo(5);
    }

}