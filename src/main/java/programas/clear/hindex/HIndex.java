package programas.clear.hindex;

import java.util.Arrays;

public class HIndex {
    /*
     * 조건
     * 1. 논문수 = 배열의크기
     * 2. 인용 횟수 h
     * 3. 인용횟수가 h 인 논문의 수가 h 이면 통과 아니면 반복 = k
     *
     * 가정 -1
     * 1. 작은수로 정렬
     * 2. 작은수를 기준으로 h 를 선정
     * 3. k  = 배열의 크기 - 기준인 h 의 인덱스
     * 4. k < h 보다 작으면 증가
     * 5. K >= h 일 때 까지 반복
     *
     * 가정 -1 문제
     * h가 바로 통과 함
     * 그럼 내림차순으로 정렬하고 해보자
     *
     * 가정-2
     * 1. 큰수로 정렬
     * 2. 큰수를 기준으로 h 를 선정
     * 3. k  = 배열의 크기 - 기준인 h 의 인덱스
     * 4. k < h 보다 작으면 증가
     * 5. K >= h 일 때 까지 반복
     *
     * 가정 -1 문제
     * 큰수로 하면 비교하는것에서 문제가 발생?아니다 다시해보자
     *
     *
     * 두 가정의 오류
     * 코드를작성할때 k 를 인덱스로 안하고 h 로 해서 오류가 남 둘다 성립하나봄
     * 고쳐 동작  동작이 됬지만 태스트 케이스 대부분 불통과 반례를 찾아보자
     *
     * 기준을 잘못잡았다.
     * 4. k < h 보다 작으면 증가
     * 5. K >= h 일 때 까지 반복
     * 이 아닌 k < h 면 그만둬야함
     * */

    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        int h = 0;
        int k = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            h = citations[i];
            k =  citations.length - i;
            if (k <= h) {
                answer = k;
                break;
            }
        }
        return answer;
    }

}
