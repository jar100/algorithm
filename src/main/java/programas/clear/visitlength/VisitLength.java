package programas.visitlength;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class VisitLength {
    public int solution(String dirs) {
        int answer = 7;
        Coordinate coordinate = new Coordinate();

        for (int i = 0; i < dirs.length(); i++) {
            coordinate.move(dirs.charAt(i));
        }

        return coordinate.visitLenght();
    }

    static class Coordinate {
        private Set<Line> movingHistory = new HashSet<>();
        private Point nowPoint = new Point(0,0);


        public Point nextPoint(char a) {
            if (a == 'U' && !(Math.abs(this.nowPoint.yPoint + 1 ) > 5)) {
               return new Point(this.nowPoint.xPoint,this.nowPoint.yPoint + 1);
            }

            if (a == 'D' && !(Math.abs(this.nowPoint.yPoint - 1) > 5)) {
                return new Point(this.nowPoint.xPoint,this.nowPoint.yPoint - 1);
            }

            if (a == 'R' && !(Math.abs(this.nowPoint.xPoint + 1) > 5)) {
                return new Point(this.nowPoint.xPoint + 1,this.nowPoint.yPoint);

            }

            if (a == 'L' && !(Math.abs(this.nowPoint.xPoint - 1) > 5)) {
                return new Point(this.nowPoint.xPoint - 1,this.nowPoint.yPoint);
            }
            return  nowPoint;
        }

        public void move(char a) {
            Point nextPoint = nextPoint(a);
            Line line = new Line(nowPoint,nextPoint);
            if (line.size() > 1) {
                movingHistory.add(line);
            }
            nowPoint = nextPoint;
        }

        public int visitLenght() {
            return movingHistory.size();
        }
    }

    static class Line {
        private Set<Point> line = new HashSet<>();

        public Line(Point a, Point b) {
            this.line.add(a);
            this.line.add(b);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Line line1 = (Line) o;
            return Objects.equals(line, line1.line);
        }

        @Override
        public int hashCode() {
            return Objects.hash(line);
        }

        public int size() {
            return this.line.size();
        }
    }

    static class Point {
        private int xPoint;
        private int yPoint;

        public Point(int xPoint, int yPoint) {
            this.xPoint = xPoint;
            this.yPoint = yPoint;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return xPoint == point.xPoint &&
                    yPoint == point.yPoint;
        }

        @Override
        public int hashCode() {
            return Objects.hash(xPoint, yPoint);
        }
    }
}
