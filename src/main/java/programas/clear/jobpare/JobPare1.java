package programas.clear.jobpare;

import java.util.*;

public class JobPare1 {
    public int solution(int n) {
        int answer = 0;

        List<Integer> all = new ArrayList<>();
        List<Integer> sosu = new ArrayList<>();
        all.add(0);
        all.add(0);

        for (int i = 2; i < n; i++) {
            all.add(i);
        }
        for (int i = 2; i < n; i++) {
            if (all.get(i) != 0) {
                sosu.add(all.get(i));
                for (int j = i + i; j < n ; j += i) {
                    all.set(j,0);
                }
            }

        }
        List<Integer> a = new ArrayList<>();
        System.out.println(sosu);
        int[] arr = new int[n];
        doCombination(arr, sosu.size(),3 , 0, 0, sosu,a);
        return a.size();
    }
    public void doCombination(int[] combArr, int n, int r, int index, int target, List<Integer> arr, List<Integer> answer){
        if(r == 0){
            int a = 0;
            for(int i=0; i< index; i++) {
                a += arr.get(combArr[i]);
            }
            System.out.println(combArr.length);
            System.out.println("asdfasdf: "+ a);
            if (a == combArr.length) {
                answer.add(1);
            }
        }else if(target == n) return;
        else{
            combArr[index]=target;
            doCombination(combArr, n, r-1, index+1, target+1, arr,answer); // (i)
            doCombination(combArr, n, r, index, target+1, arr,answer); //(ii)
        }
    }


    public boolean solution2(String a, String b) {
        boolean answer = true;
        int lostIndex = a.length() - 1;

        int[] isUseChar = new int[a.length()];

        String newB =b.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            char ab = newB.charAt(i);
            if (indexOf(a, isUseChar, ab) < 0) {
                return false;
            }
            if (i == lostIndex -1) {
                return true;
            }
        }
        return answer;
    }

    public int indexOf(String grade,int[] isUseChar, char target) {
        int count = 0;
        for (int i = 0; i < grade.length(); i++) {
            if (grade.charAt(i) == target) {
                if (isUseChar[i] == -1) {
                } else {
                    isUseChar[i] = -1;
                    return count;
                }
            }
            count++;
        }
        return -1;
    }




    public int solution3(String N) {
        int answer = 0;
        int count = 0;
        Map<Character,Integer> contChar = new HashMap<>();
        for (int i = 0; i < N.length(); i++) {
            if (contChar.containsKey(N.charAt(i))) {
                contChar.put(N.charAt(i),contChar.get(N.charAt(i)) + 1);
            } else {
                contChar.put(N.charAt(i),1);
            }
        }
        for (Integer value : contChar.values()) {
            if (value > 1) {
                if (value % 2 == 0) {
                    // 짝수
                    answer += (value / 2);
                } else {
                    //홀수
                    answer += ((value - 1) / 2);
                }
            } else {
                count ++;
            }

        }

        if (count > 0) {
            answer *= 2;
            answer ++;
        } else {
            answer *= 2;
        }

        return answer;
    }

    public int solution4(int[] grade, int max_diff) {
        int answer = 0;
        Arrays.sort(grade);
        for (int i = grade.length - 1; i >=0 ; i--) {
            int maxNum = grade[i];
            int minNum = maxNum - max_diff;

            while (!contains(grade,minNum)) {
                minNum ++;
            }

            int nowAnswer = indexOf(grade,maxNum) - indexOf(grade,minNum) + 1;
            if (answer < nowAnswer) {
                answer = nowAnswer;
            }
        }

        return answer;
    }

    public boolean contains(int[] grade, int minNum) {
        for (int i : grade) {
            if (i == minNum) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int[] grade, int target) {
        int count = 0;
        for (int i : grade) {
            if (i == target) {
                return count;
            }
            count++;
        }
        return -1;
    }
}
