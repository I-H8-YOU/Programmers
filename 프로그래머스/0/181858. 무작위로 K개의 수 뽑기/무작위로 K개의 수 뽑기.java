import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> nSet = new LinkedHashSet<>();
        for(int i : arr){
            nSet.add(i);
        }
        int cnt = 0;
        for(Integer num : nSet){
            if(cnt == k){
                break;
            }
            answer[cnt] = num;
            cnt++;
        }
        if(answer[answer.length - 1] == 0){
            for(int m = answer.length - 1 ; ; m--){
                if(answer[m] != 0) break;
                answer[m] = -1;
            }
            return answer;
        }else{
            return answer;
        }
        // System.out.println(nSet);
        // return answer;
    }
}