package study.jvmoom;

import java.util.ArrayList;
import java.util.List;

public class HeavyInstance {
    char[] data = new char[10000000];
}

class OOMTest {

    public static void main(String[] args) {

        List<HeavyInstance> dataList = new ArrayList<HeavyInstance>();

        while (true) {
            dataList.add(new HeavyInstance());
        }
    }
}