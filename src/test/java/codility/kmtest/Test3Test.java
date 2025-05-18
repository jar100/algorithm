package codility.kmtest;

import static org.junit.jupiter.api.Assertions.*;

class Test3Test {

    @org.junit.jupiter.api.Test
    void solution() {
        Test3 test3 = new Test3();
        // Example test: [3, 2, 3, 2, 3]
        assertEquals(5, test3.solution(new int[]{3, 2, 3, 2, 3}));

        // Example test: [7, 4, -2, 4, -2, -9]
        assertEquals(4, test3.solution(new int[]{7, 4, -2, 4, -2, -9}));

        // Example test: [7, -5, -5, -5, 7, -1, 7]
        assertEquals(3, test3.solution(new int[]{7, -5, -5, -5, 7, -1, 7}));

        // Example test: [1]
        assertEquals(1, test3.solution(new int[]{1}));
    }
}