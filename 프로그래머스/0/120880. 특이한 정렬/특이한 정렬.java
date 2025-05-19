import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> nList = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        nList.sort((a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);

            if (distA != distB) {
                return distA - distB;
            } else {
                return b - a; 
            }
        });
         int[] answer = nList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}