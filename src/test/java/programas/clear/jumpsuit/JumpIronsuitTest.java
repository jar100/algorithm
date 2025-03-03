package programas.clear.jumpsuit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class JumpIronsuitTest {
    @Test
    public void jumpTest() {
        JumpIronsuit jumpIronsuit = new JumpIronsuit();
        assertThat(jumpIronsuit.solution2(6)).isEqualTo(2);
        assertThat(jumpIronsuit.solution2(5)).isEqualTo(2);
        assertThat(jumpIronsuit.solution2(5000)).isEqualTo(5);
    }

}