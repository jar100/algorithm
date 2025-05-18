package codility.kmtest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Test2Test {
    Test2 test2 = new Test2();

    @org.junit.jupiter.api.Test
    void solution() {
        //
        // Example test 1
        int[] T1 = {0, 0, 1, 1};
        int[] A1 = {2};
        int result1 = test2.solution(T1, A1);
        assertThat(result1).isEqualTo(3);

        // Example test 2
        int[] T2 = {0, 0, 0, 0, 2, 3, 3};
        int[] A2 = {2, 5, 6};
        int result2 = test2.solution(T2, A2);
        assertThat(result2).isEqualTo(5);

        // Example test 3
        int[] T3 = {0, 0, 1, 2};
        int[] A3 = {1, 2};
        int result3 = test2.solution(T3, A3);
        assertThat(result3).isEqualTo(3);

        // Example test 4
        int[] T4 = {0, 3, 0, 0, 5, 0, 5};
        int[] A4 = {4, 2, 6, 1, 0};
        int result4 = test2.solution(T4, A4);
        assertThat(result4).isEqualTo(7);

        // Example test 4
        int[] T5 = {0, 0, 0, 0, 0, 0, 0};
        int[] A5 = {1,2,3,4};
        int result5 = test2.solution(T5, A5);
        assertThat(result5).isEqualTo(5);
    }

}