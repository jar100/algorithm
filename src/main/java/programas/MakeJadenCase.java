package programas;

public class MakeJadenCase {/*
    JadenCase란 모든 단어의 첫 문자가 대문자이고,
    그 외의 알파벳은 소문자인 문자열입니다. 문자열 s가 주어졌을 때,
    s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.*/

    public static String solution(String s) {
        s = s.toLowerCase();
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            if(a[i].length() >= 1) {
                //string char 로 쪼깨 대문자 변환
                char[] array = a[i].toCharArray();
                array[0] = Character.toUpperCase(array[0]);
                //쪼갠것들을 a[i] 로 다시 반환
                a[i] = new String(array);
            }
        }

        String result = a[0];
        for (int i = 1; i < a.length; i++) {
            result += " " + a[i];
        }
        return result;
    }

}
