package study.templetcallback;

import org.junit.Test;

public class StudyTest {
    @Test
    public void 템플릿콜팩패턴연습1() {
        Study study = new Study();
        study.runContext("수학");
    }

    /*@Test
    public void 연습2() {
        Study study = new Study();
        study.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("국어공부하자.");
            }
        });
    }*/

    @Test
    public void 연습2_1() {
        Study study = new Study();
        study.runContext("국어");
    }
}