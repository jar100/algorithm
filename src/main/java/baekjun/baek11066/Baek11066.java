package baekjun.baek11066;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

import static java.lang.Integer.parseInt;

public class Baek11066 {
    public static void main(String[] args) throws IOException {
        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = solution(4,new int[] {40, 30, 30, 50});
        System.out.println(a);

        int b = solution(15,new int[] {1, 21, 3, 4, 5, 35, 5, 4, 3, 5, 98, 21, 14, 17, 32});
        System.out.println(b);
    }

    public static int solution(int n, int[] list) {
        
        int answer = 0;
        for (int i = 0; i < list.length - 1; i++) {

        }
/*
        if (!queue.isEmpty()) {
            System.out.println("큐남은놈" + queue.peek());
        }*/
        return answer;
    }


}
