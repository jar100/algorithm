package programas;

public class Test_2 {
    public static void main(String[] args) {
        System.out.println("asd");
        System.out.println(solution(3,25));
    }
    //2016
//    2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
//    두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
//    요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//    입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
    public static String solution(int a, int b) {
        //윤년 2/29일
        //1 31 2 29 3 31 4 30 5 31 6 30 7 31 8 31 9 30 10 31 11 30 12 31
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;
        for (int i = 0; i < a-1; i++) {
            count += month[i];
        }
        int result = (count+ b)%7;
        String answer = day[result];
        return answer;
    }
}
