import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> nSet = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            nSet.add(nums[i]);
        }
        answer = Math.min(nSet.size(), nums.length / 2);
        return answer;
    }
}