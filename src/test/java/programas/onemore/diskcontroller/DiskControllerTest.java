package programas.onemore.diskcontroller;

import org.junit.Test;
import programas.BaseTest;

public class DiskControllerTest extends BaseTest {
    @Test
    public void name() {
        DiskController diskController = new DiskController();

        softly.assertThat(diskController.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}})).isEqualTo(9);
        softly.assertThat(diskController.solution2(new int[][]{{0, 3}, {1, 9}, {2, 6}})).isEqualTo(9);
        softly.assertThat(diskController.solution3(new int[][]{{0, 3}, {1, 9}, {2, 6}})).isEqualTo(9);
    }

    @Test
    public void name1() {
        DiskController diskController = new DiskController();
        /*
        * 생각 뽑고 딜레이 생성
        * 3 + (7 ) + (7 + 3 -4) + (3 + 6 + 9  + 3 -4)/4
        * */
        softly.assertThat(diskController.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}, {4, 3}})).isEqualTo(9);
        softly.assertThat(diskController.solution2(new int[][]{{0, 3}, {1, 9}, {2, 6}, {4, 3}})).isEqualTo(9);
    }


    @Test
    public void name2() {
        DiskController diskController = new DiskController();

        softly.assertThat(diskController.solution(new int[][]{{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}})).isEqualTo(13);
        softly.assertThat(diskController.solution2(new int[][]{{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}})).isEqualTo(13);
    }

    @Test
    public void name3() {
        DiskController diskController = new DiskController();

        /// 반례를 들어보자

        softly.assertThat(diskController.solution(new int[][]{{0, 9}, {2, 4}, {7, 5}, {0, 7}, {0, 3}})).isEqualTo(12);
        softly.assertThat(diskController.solution2(new int[][]{{0, 9}, {2, 4}, {7, 5}, {0, 7}, {0, 3}})).isEqualTo(12);
        softly.assertThat(diskController.solution3(new int[][]{{0, 9}, {2, 4}, {7, 5}, {0, 7}, {0, 3}})).isEqualTo(12);
    }



}