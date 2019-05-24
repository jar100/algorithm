package meetingtest.groundx;

public class Refrigerator {
    public int solution(int[] open, int[] close) {
        int openindex = 0;
        int closeindex = 0;
        boolean isOpen = false;
        int answer = 0;
        int temp = 0;
        while (openindex != open.length ) {

            if (!isOpen && close[closeindex] > open[openindex]) {
                isOpen = true;
                temp = close[closeindex] - open[openindex];

            }

            if (isOpen && close[closeindex] > open[openindexInclse(openindex  + 1,open.length)]) {
                if (openindex < open.length - 1) {
                    openindex++;
                } else {
                    isOpen = false;
                }
            } else  if (close[closeindex] < open[openindexInclse(openindex  + 1,open.length)] || openindex >= open.length - 1) {
                isOpen = false;
            }


            if (!isOpen) {
                answer += temp;
                if (temp != 0) {
                    openindex ++ ;
                }
                temp = 0;
                closeindex++;
            }

        }

        return answer;
    }


    // 하는이유 인덱스 가 아웃오브 메모리가 발생할 수 있다. 그래서 함
    public int openindexInclse(int openindex, int length) {
        return openindex >= length - 1 ? length - 1 : openindex;
    }


}
