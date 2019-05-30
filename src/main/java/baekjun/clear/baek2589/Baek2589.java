package baekjun.clear.baek2589;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Baek2589 {
    static int height, width;
    static char[][] map = new char[51][51];

    public static int bfs(int startY, int startX) {
        int[][] visit = new int[51][51];
        int mx = 0;
        int[] dy = {-1, 0, 0, 1};
        int[] dx = {0, -1, 1, 0};

        Queue<int[]> que = new LinkedList<>();
        visit[startY][startX] = 1;
        que.add(new int[]{startY, startX});

        while (!que.isEmpty()) {

            int[] point = que.poll();
            int y = point[0];
            int x = point[1];

            if (visit[y][x] > mx) {
                mx = visit[y][x];
            }

            for (int i = 0; i < 4; i++) {
                int nextY = y + dy[i];
                int nextX = x + dx[i];

                if (nextY >= 0 && nextY < height && nextX >= 0 && nextX < width) {
                    if (map[nextY][nextX] == 'L' && visit[nextY][nextX] == 0) {
                        que.add(new int[]{nextY, nextX});
                        visit[nextY][nextX] = visit[y][x] + 1;
                    }
                }
            }
        }

        return mx - 1;
    }

    public static int solve1() {
        int mx = 0;
        int val;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (map[i][j] == 'L') {
                    val = bfs(i, j);
                    if (val > mx) {
                        mx = val;
                    }
                }
            }
        }

        return mx;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // map 을 만드는 과정
        int[] ints = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        height = ints[0];
        width = ints[1];

        for (int i = 0; i < ints[0]; i++) {
            String line = bf.readLine();
            for (int j = 0; j < ints[1]; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        System.out.println(solve1());
    }


//    private void solve() {
//        int c = sc.nextInt();
//        int r = sc.nextInt();
//        char[][] map = new char[c][r];
//        int[] dx = {-1, 0, 1, 0};
//        int[] dy = {0, -1, 0, 1};
//        int ans = 0;
//
//        for (int i = 0; i < c; i++) {
//            map[i] = sc.readLine().toCharArray();
//        }
//
//        for (int i = 0; i < c; i++) {
//            for (int j = 0; j < r; j++) {
//                Queue<Point> q = new LinkedList<Point>();
//                boolean[][] visited = new boolean[c][r];
//                int[][] dist = new int[c][r];
//                char ch = map[i][j];
//                visited[i][j] = true;
//                q.add(new Point(i, j));
//                int temp = 0;
//
//                while (!q.isEmpty()) {
//                    Point p = q.poll();
//                    int x = p.x;
//                    int y = p.y;
//
//                    for (int k = 0; k < 4; k++) {
//                        int nx = dx[k] + x;
//                        int ny = dy[k] + y;
//
//                        if (0 <= nx && nx < r && 0 <= ny && ny < c) {
//                            if (!visited[ny][nx] && map[ny][nx] == ch) {
//                                q.add(new Point(ny, nx));
//                                dist[ny][nx] = dist[y][x] + 1;
//                                visited[ny][nx] = true;
//
//                                if (temp < dist[ny][nx]) {
//                                    temp = dist[ny][nx];
//                                }
//                            }
//                        }
//                    }
//                }
//                if (ans < temp) {
//                    ans = temp;
//                }
//            }
//        }
//        System.out.println(ans);
//    }
//
//    public static class Point {
//        int x;
//        int y;
//
//        Point(int y, int x) {
//            this.x = x;
//            this.y = y;
//        }
//    }


}
