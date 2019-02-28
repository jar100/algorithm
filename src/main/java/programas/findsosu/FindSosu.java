package programas.findsosu;

import java.util.HashSet;
import java.util.Set;

public class FindSosu {
    public int solution(String numbers) {
        char[] list = numbers.toCharArray();
        int[] combArr = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            combArr[i] = Integer.parseInt(String.valueOf(list[i]));
        }
        Set<Integer> asdf = new HashSet<>();
        for (int i = 1; i <= list.length; i++) {
            //doCombination(combArr, list.length, i, 0, 0, list, asdf);
            perm(list, 0, i, asdf);
            System.out.println("찾기");
        }

        System.out.println("소수 리스트입니다.");
        System.out.println(asdf);

        return asdf.size();
    }

    public void perm(char[] arr, int depth, int k, Set asdf) {
        if (depth == k) { // 한번 depth 가 k로 도달하면 사이클이 돌았음. 출력함.
            print(arr, k, asdf);
            return;
        } else {
            for (int i = depth; i < arr.length; i++) {
                swap(arr, i, depth);
                perm(arr, depth + 1, k, asdf);
                swap(arr, i, depth);
            }
        }
    } // 자바에서는 포인터가 없기 때문에 아래와 같이, 인덱스 i와 j를 통해 바꿔줌.

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void print(char[] arr, int k, Set asdf) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < k; i++) {

            if (i == k - 1) {
                System.out.println(arr[i]);
                a.append(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
                a.append(arr[i]);
            }
        }

        isSosu(asdf, a);
    }

    private void isSosu(Set asdf, StringBuilder a) {
        int b = Integer.parseInt(String.valueOf(a));
        boolean isSosu = true;
        System.out.println("나는 소수니:" + b);
        if (b <= 1) {
            System.out.println("아니얌");
            isSosu = false;
        }

        for (int j = 2; j < Math.sqrt(b); j++) {


            if (b % j == 0) {
                System.out.println("아니얌");
                isSosu = false;
                break;
            }

            if (j == Math.floor(Math.sqrt(b))) {
                System.out.println("응소수야");

            }
        }

        if (isSosu && b < 10000000) {
            asdf.add(b);
        }
    }


}
