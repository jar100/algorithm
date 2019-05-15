package study.stream.what_is_different_map_and_flatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class CommpareToMapAndFlatmap {

    public static void main(String[] args) {
        int[][] b = {{1, 2}, {1, 3}, {1, 4}, {2, 3}, {3, 4}};
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String[][] data = new String[][]{ {"1", "2"}, {"3", "4"} };

        Arrays.stream(data).map(x -> Arrays.stream(x))
                .forEach(s -> s.forEach(System.out::println));

        Arrays.stream(data).flatMap(x -> Arrays.stream(x))
                .forEach(System.out::println);

    }


}
