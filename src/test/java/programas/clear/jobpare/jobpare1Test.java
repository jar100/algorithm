package programas.clear.jobpare;

import org.junit.Test;
import programas.BaseTest;

public class jobpare1Test extends BaseTest {
    @Test
    public void solution() {
        JobPare1 jobpare1 = new JobPare1();

        softly.assertThat(jobpare1.solution(33)).isEqualTo(4);
    }

    @Test
    public void solution2() {
        JobPare1 jobpare1 = new JobPare1();

        softly.assertThat(jobpare1.solution(9)).isEqualTo(0);
    }

    @Test
    public void name() {
        JobPare1 jobPare1 = new JobPare1();
        softly.assertThat(jobPare1.solution2_1(	"listen", "silent")).isTrue();
    }

    @Test
    public void name1() {
        JobPare1 jobPare1 = new JobPare1();
        //softly.assertThat(jobPare1.solution3(	"1213002")).isEqualTo(7);
        softly.assertThat(jobPare1.solution3(	"123300")).isEqualTo(5);

    }

    @Test
    public void name2() {
        JobPare1 jobPare1 = new JobPare1();
        //softly.assertThat(jobPare1.solution3(	"1213002")).isEqualTo(7);
        softly.assertThat(jobPare1.solution4(	new int[]{4,1,3,5},2)).isEqualTo(3);

    }

    @Test
    public void name3() {
        JobPare1 jobPare1 = new JobPare1();
        //softly.assertThat(jobPare1.solution3(	"1213002")).isEqualTo(7);
        softly.assertThat(jobPare1.solution4(	new int[]{5,1,3},1)).isEqualTo(1);
        softly.assertThat(jobPare1.solution4(	new int[]{10, 9,8,7,6,5,4,3,2,1},1)).isEqualTo(2);
        softly.assertThat(jobPare1.solution4(	new int[]{10, 9,8,7,6,5,4,3,2,1},5)).isEqualTo(6);

    }
}