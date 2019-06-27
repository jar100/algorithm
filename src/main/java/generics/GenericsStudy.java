package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsStudy {

    List ints = Arrays.asList( new Integer[] {
            new Integer(1), new Integer(2), new Integer(3)
    } );

    List<Integer> genericsInts = new ArrayList<>();
}
