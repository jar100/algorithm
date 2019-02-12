package programas.clear.notfinishrun;

import org.junit.Test;
import programas.BaseTest;

public class NotFinishRunTest extends BaseTest {
    @Test
    public void solution() {
        NotFinishRun notFinishRun = new NotFinishRun();
        softly.assertThat(notFinishRun.solution(
                new String[]{"leo", "kiki", "eden"}
                , new String[]{"eden", "kiki"})).isEqualTo("leo");
    }

    @Test
    public void solution1() {
        NotFinishRun notFinishRun = new NotFinishRun();
        softly.assertThat(notFinishRun.solution(
                new String[]{"mislav", "stanko", "mislav", "ana"}
                , new String[]{"stanko", "ana", "mislav"})).isEqualTo("mislav");
    }

    @Test
    public void solution2() {
        NotFinishRun notFinishRun = new NotFinishRun();
        softly.assertThat(notFinishRun.solution(
                new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}
                , new String[]{"josipa", "filipa", "marina", "nikola"})).isEqualTo("vinko");
    }
}