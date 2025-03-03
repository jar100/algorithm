package programas.changechar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChangeCharTest {
    ChangeChar changeChar = new ChangeChar();


    @Test
    public void name() {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        assertThat(changeChar.solution(begin, target, words)).isEqualTo(4);
    }

    @Test
    public void name2() {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log"};
        assertThat(changeChar.solution(begin, target, words)).isEqualTo(0);
    }


    @Test
    public void 타겟은있지만타겟으로변화되는게없다() {
        // 0;
        String begin = "hit";
        String target = "zul";
        String[] words = {"hot", "dot", "dog", "lot", "log", "zul"};
        assertThat(changeChar.solution(begin, target, words)).isEqualTo(0);
    }

    @Test
    public void 변화되는경우가많아최소값을탐색() {
        // 3;
        String begin = "hit";
        String target = "cog";
        //cog 이전값 2개
        //hog, log
        //시나리오
        // hit hot hog cog 3번;
        // 나쁜가정 1 hit hot hog lot log cog
        // 나쁜가정 2 hit dot hot hog lot log cog 등등등
        String[] words = {"hot", "dot", "hog", "lot", "log", "cog"};
        assertThat(changeChar.solution(begin, target, words)).isEqualTo(3);
    }
}