package meetingtest.junggo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JungGoOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String splitBlank = " ";
        String[] inputLength = br.readLine().split(splitBlank);
        int xLength = Integer.parseInt(inputLength[0]);
        int yLength = Integer.parseInt(inputLength[1]);


        List<List<ZPoint>> map = new ArrayList<>();
        for (int i = 0; i < yLength; i++) {
            String xMap = br.readLine();
            List<ZPoint> pointList = new ArrayList<>();
            for (int j = 0; j < xLength; j++) {
                pointList.add(new ZPoint(xMap.charAt(j)));
            }
            map.add(pointList);
        }


        for (int i = 0; i < yLength; i++) {
            for (int j = 0; j < xLength; j++) {
                ZPoint a = map.get(i).get(j);

                if (a.isStar) {
                    increse(map, i - 1, j - 1);
                    increse(map, i - 1, j);
                    increse(map, i - 1, j + 1);

                    increse(map, i, j - 1);
                    increse(map, i, j + 1);

                    increse(map, i + 1, j - 1);
                    increse(map, i + 1, j);
                    increse(map, i + 1, j + 1);

                }
            }
        }


        show(map);
    }

    private static void increse(List<List<ZPoint>> map, int i, int i2) {
        if ((i >= 0 && i < map.size()) && (i2 >= 0 && i2 < map.get(i).size())) {
            map.get(i).get(i2).increse();
        }
    }

    private static void show(List<List<ZPoint>> map) {
        for (List<ZPoint> zPoints : map) {
            String a = "";
            for (ZPoint zPoint : zPoints) {
                a += zPoint.toString();
            }
            System.out.println(a);
        }
    }

    static class ZPoint {
        private boolean isStar = false;
        private int num = 0;

        public ZPoint(char star) {
            if (star == '*') {
                this.isStar = true;
            }
        }

        @Override
        public String toString() {
            if (isStar) {
                return "*";
            }

            return "" + num;
        }

        public void increse() {
            num++;
        }
    }


}
