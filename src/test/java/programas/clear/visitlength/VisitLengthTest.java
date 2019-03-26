package programas.clear.visitlength;

import org.junit.Test;
import programas.BaseTest;

import java.util.HashSet;
import java.util.Set;

public class VisitLengthTest extends BaseTest {
    private VisitLength visitLength = new VisitLength();

    @Test
    public void name() {
        softly.assertThat(visitLength.solution("ULURRDLLU")).isEqualTo(7);

    }

    @Test
    public void name1() {
        softly.assertThat(visitLength.solution("LULLLLLLU")).isEqualTo(7);

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