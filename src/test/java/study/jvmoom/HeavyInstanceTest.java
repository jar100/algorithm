package study.jvmoom;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HeavyInstanceTest {

    @Test
    public void oomTest() {

        List<HeavyInstance> dataList = new ArrayList<HeavyInstance>();

        while (true) {
            dataList.add(new HeavyInstance());
        }
    }
}