package programas.clear.visitlength;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VisitLengthTest {
    private VisitLength visitLength = new VisitLength();

    @Test
    public void name() {
        assertThat(visitLength.solution("ULURRDLLU")).isEqualTo(7);

    }

    @Test
    public void name1() {
        assertThat(visitLength.solution("LULLLLLLU")).isEqualTo(7);

    }

    @Test
    public void name2() {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        a.add(1);
        a.add(5);

        b.add(5);
        b.add(1);
        System.out.println(a.equals(b));
    }

}