import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int cnt = 0;
        answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        for(int i = 5 ; i < num_list.length ; i++){
            answer[cnt] = num_list[i];
            cnt++;
        }
        return answer;
    }
}
