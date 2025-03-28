import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        if(k % 2 == 0){
            answer = Arrays.stream(arr).map(i -> i += k).toArray();
        }else answer = Arrays.stream(arr).map(i -> i *= k).toArray();
        return answer;
    }
}