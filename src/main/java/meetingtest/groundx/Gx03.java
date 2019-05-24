package meetingtest.groundx;

public class Gx03 {
    static String answer = "D";
    static boolean isXTurn = true;
    static boolean isFinish = false;
    public String solution(String[] board) {

        while (!isFinish) {
            checkRow(board);
            checkColumn(board);



        }

        return answer;
    }



    public boolean checkRow(String[] board) {
        for (int i = 0; i < board.length; i++) {
            int oCount = 0;
            int xCount = 0;
            int detCount = 0;

            for (int j = 0; j < board[i].length(); j++) {
                if (board[i].charAt(j) == 'o') {
                    oCount ++;
                } else if (board[i].charAt(j) == 'x') {
                    xCount ++;
                } else {
                    detCount  = j;
                }
            }

            if (oCount == 2) {
                changeTagret(board, i, detCount);
                if (isXTurn) {
                    return false;
                } else {
                    isFinish = true;
                    answer = "O";
                    return true;
                }
            }

            if (xCount == 2) {
                changeTagret(board, i, detCount);
                if (!isXTurn) {
                    return false;
                } else {
                    isFinish = true;
                    answer = "X";
                    return true;
                }
            }
        }
        return false;
    }

    public String changeTagret(String[] board, int i, int j) {
        StringBuilder target = new StringBuilder(board[i]);

        if (isXTurn) {
            target.setCharAt(j,'x');
        } else {
            target.setCharAt(j,'o');
        }

        board[i] = target.toString();
//       누구의 턴인지 선택 바꾼다.
        // 스택틱변수를 사용하는게 맞을까
        //todo 리팩토링
       // isXTurn = !isXTurn;

        return board[i];
    }




    public boolean checkColumn(String[] board) {
        for (int j = 0; j < board[0].length(); j++) {
            int oCount = 0;
            int xCount = 0;
            int detCount = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[i].charAt(j) == 'o') {
                    oCount ++;
                } else if (board[i].charAt(j) == 'x') {
                    xCount ++;
                } else {
                    detCount  = i;
                }
            }

            if (oCount == 2) {
                changeTagret(board, detCount, j);
                if (isXTurn) {
                    return false;
                } else {
                    isFinish = true;
                    answer = "O";
                    return true;
                }
            }

            if (xCount == 2) {
                changeTagret(board, detCount, j);
                if (!isXTurn) {
                    return false;
                } else {
                    isFinish = true;
                    answer = "X";
                    return true;
                }
            }


            //판별
//            if (checkWinner()) {
//
//            }

            //참이면 바꾸고 리턴


        }
        return false;
    }


    public boolean checkDiagonal1() {
        // 대각선 : \

        return false;
    }


    public boolean checkDiagonal2() {
        // 대각선 : /


        return false;
    }

}
