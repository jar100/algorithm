package meetingtest.groundx;

import static java.lang.Math.min;

public class Gx03 {
    int cache[] = new int[19683]; // 3^9
    String[] board;

    //turn이 한 줄을 만들었는지 반환
    public boolean isFinished(char turn) {
        // 가로
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) != turn) {
                    break;
                }
                if (j == 2) {
                    return true;
                }
            }
        }

        // 세로
        for (int j = 0; j < 3; j++) {
            for (int i = 0; true; i++) {
                if (board[i].charAt(j) != turn) {
                    break;
                }
                if (i == 2) {
                    return true;
                }
            }
        }

        // 오른쪽 아래 대각선
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(i) != turn) {
                break;
            }

            if (i == 2) {
                return true;
            }
        }

        // 왼쪽 아래 대각선
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(2 - i) != turn) {
                break;
            }

            if (i == 2) {
                return true;
            }
        }

        return false;
    }

    // 틱택토 게임이 주어질 때, [0, 19682] 범위의 정수로 변환한다.
    public int bijection() {
        int ret = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ret *= 3;

                if (board[i].charAt(j) == 'o') {
                    ++ret;
                } else if (board[i].charAt(j) == 'x') {
                    ret += 2;
                }
            }
        }
        return ret;
    }

    // 이번 턴인 내가 이길 수 있으면 1을, 비길 수 있으면 0을, 지면 -1을 리턴한다.
    public int canWin(char turn) {
        // 기저 사례 : 마지막에 상대가 둬서 한 줄이 만들어진 경우
        if (isFinished((char) ('o' + 'x' - turn))) {
            return -1;
        }
        int resultInedx = bijection();
        int result = cache[resultInedx];
        // 케시를 사용하려면 result 가 -2 가 아니면 리턴 보인값

        //
        if (result != -2) {
            return result;
        }

//        int result = -2;
        // 모든 반환 값의 min을 취하자.
        int minValue = 2;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == '.') {
                    checkMark(turn, i, j);
                    minValue = min(minValue, canWin((char) ('o' + 'x' - turn)));
                    checkMark('.', i, j);
                }
            }
        }

        // 플레이 할 수 없거나, 어떻게 해도 비기는 것이 최선인 경우
        if (minValue == 2 || minValue == 0) {
            return cache[resultInedx] = 0;
        }

        // 최선이 상대가 이기는 거라면 난 무조건 지고, 상대가 지는 거라면 난 이긴다.
        return cache[resultInedx] = -minValue;
    }

    private void checkMark(char turn, int i, int j) {
        StringBuilder newBoard = new StringBuilder(board[i]);
        newBoard.setCharAt(j, turn);
        board[i] = newBoard.toString();
    }


    public String solution(String[] board) {
        this.board = board;
        for (int i = 0; i < 19683; i++) {
            cache[i] = -2;
        }
        char start = 'x';

        int get = canWin(start);

        if (get == -1) // 상대가 이기는 경우
        {
            return "O";
        } else if (get == 0) // 무승부
        {
            return "D";
        } else {
            return "X";

        }
    }


}
