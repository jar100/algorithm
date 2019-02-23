package programas.clear.jobpare;

import java.util.ArrayList;
import java.util.List;

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

}
