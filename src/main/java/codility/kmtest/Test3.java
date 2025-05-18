package codility.kmtest;

public class Test3 {
    public int solution(int[] A) {
        int n = A.length;
        // 길이 0,1 은 그대로 반환
        if (n < 2) {
            return n;
        }
        int maxLength = 1; // 가장 긴 부분 배열 길이
        int windowStart = 0; // 현재 윈도우의 시작 인덱스
        int evenPositionValue = A[0]; // 짝수 상대 위치의 값
        int oddPositionValue = 0; // 홀수 상대 위치의 값
        boolean isOddValueSet = false; // 홀수 위치 값이 설정되었는지 여부

        for (int i = 1; i < n; i++) {
            boolean isEvenPosition = isEvenPosition(i, windowStart);
            if (isEvenPosition) {
                // 짝수 상대위치에선 firstValue 이어야 함
                if (A[i] != evenPositionValue) {
                    // i-1에서 새 윈도우를 시작
                    windowStart = i - 1;
                    evenPositionValue = A[windowStart];
                    oddPositionValue = A[i];
                    isOddValueSet = true;
                }
            } else {
                // 홀수 상대위치에선 secondVal 이어야 함
                if (!isOddValueSet || A[i] != oddPositionValue) {
                    windowStart = i - 1;
                    evenPositionValue = A[windowStart];
                    oddPositionValue = A[i];
                    isOddValueSet = true;
                }
            }
            maxLength = Math.max(maxLength, i - windowStart + 1);
        }

        return maxLength;
    }

    private boolean isEvenPosition(int i, int start) {
        int rel = (i - start) & 1;
        return rel == 0;
    }
}
