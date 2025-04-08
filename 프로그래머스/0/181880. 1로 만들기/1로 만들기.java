import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = Arrays.stream(num_list).map(n -> {
            int num = n;
            int cnt = 0;
            for(;;){
                if(num == 1){
                    break;
                }
                if(num % 2 == 0){
                    cnt++;
                    num /= 2;
                }else{
                    cnt++;
                    num = (num - 1) / 2;
                }
                if(num == 1){
                    break;
                }
            } return cnt;
        }).sum();
        return answer;
    }
}