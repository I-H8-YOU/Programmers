import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> nSet = new LinkedHashSet<>();
        for(int i = 0 ; i < elements.length ; i++){
            int sum = 0;
            for(int k = 0 ; k < elements.length ; k++){
                sum += elements[(i+k)%elements.length];
                nSet.add(sum);
            }
        }
        answer = nSet.size();
        return answer;
    }
}