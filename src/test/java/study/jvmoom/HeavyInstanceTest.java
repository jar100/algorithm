package study.jvmoom;

import org.junit.Test;
import programas.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class HeavyInstanceTest extends BaseTest {

    @Test
    public void oomTest() {

        List<HeavyInstance> dataList = new ArrayList<HeavyInstance>();

        while (true) {
            dataList.add(new HeavyInstance());
        }
    }
}