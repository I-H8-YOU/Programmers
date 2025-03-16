import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        List<Integer> nList = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            if(i % k == 0){
                nList.add(i);
            }else continue;
        }
        answer = new int[nList.size()];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = (int)nList.get(i);
        }
        return answer;
    }
}
