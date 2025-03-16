import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> nList = new ArrayList<>();
        for(int i = 0; i < num_list.length ; i = i + n){
            nList.add(num_list[i]);
        }
        int[] answer = new int[nList.size()];
        for(int i = 0; i < answer.length ; i++){
            answer[i] = nList.get(i).intValue();
        }
        return answer;
    }
}
