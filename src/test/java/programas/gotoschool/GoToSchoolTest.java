package programas.gotoschool;

import org.junit.Test;
import programas.BaseTest;

import java.util.Arrays;

public class GoToSchoolTest extends BaseTest {
    GoToSchool goToSchool = new GoToSchool();

    @Test
    public void name() {
        softly.assertThat(goToSchool.solution(4, 3, new int[][]{{2, 2}})).isEqualTo(4);

    }

    @Test
    public void name1() {
        softly.assertThat(goToSchool.solution(4, 3, new int[][]{{}})).isEqualTo(10);

    }

    @Test
    public void 멕시멈테스트() {
        softly.assertThat(goToSchool.solution(100, 100, new int[][]{{}})).isEqualTo(690285631);

    }

    @Test
    public void 줄이기() {
        softly.assertThat(goToSchool.solution(100, 100, new int[][]{{2, 2}, {1, 1}, {3, 2}, {99,99}})).isEqualTo(661489457);
        softly.assertThat(goToSchool.solution2(100, 100, new int[][]{{2, 2}, {1, 1}, {3, 2}, {99,99}})).isEqualTo(661489457);
    }

    @Test
    public void ㄹ자로가는지() {
        softly.assertThat(goToSchool.solution(10,10, new int[][]{ {2, 2}, {1, 5}, {3, 2}, {2,5}})).isEqualTo(0);
    }

    @Test
    public void 인트빈배열태스트() {
        int[][] a = new int[][]{{}};
        System.out.println(a[0].length);
    }

    @Test
    public void 인트이중배열정렬확인() {
        int[][] a = new int[][]{{1, 2}, {2, 3}, {1, 4}, {1, 3}, {3, 3}};

        Arrays.sort(a, (o1, o2) -> {
            if (o1[0] > o2[0]) {
                return 1;
            } else if (o1[0] < o2[0]) {
                return -1;
            } else {
                return o1[1] > o2[1] ? 1 : -1;
            }
        });


        System.out.println(Arrays.deepToString(a));
    }
}