package codility.naver;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class solutionTest {
    solution solution = new solution();

    @ParameterizedTest
    @MethodSource("result")
    void name(int[] a) {
        int i = solution.solution01(a);
        assertThat(i).isEqualTo(7);
    }


    private static Stream<Arguments> result() {
        return Stream.of(
            Arguments.of(new int[] {9, 3, 9, 3, 9, 7, 9})
        );
    }

}