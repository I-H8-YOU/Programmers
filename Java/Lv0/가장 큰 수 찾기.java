import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max_val = Arrays.stream(array).max().getAsInt();
        int cnt = 0;
        for(int i : array){
            if(i == max_val){
                break;
            }else cnt++;
        }
        answer[0] = max_val;
        answer[1] = cnt;
        return answer;
    }
}
