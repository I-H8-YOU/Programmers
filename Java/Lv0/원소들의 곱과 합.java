import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = (int)Math.pow(Arrays.stream(num_list).sum(), 2);
        int multi = 1;
        for(int n : num_list){
            multi *= n;
        }
        answer = sum > multi ? 1 : 0;
        return answer;
    }
}
