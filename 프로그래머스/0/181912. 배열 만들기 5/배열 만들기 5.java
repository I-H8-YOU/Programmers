import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
       answer = Arrays.stream(intStrs).map(p -> Integer.parseInt(p.substring(s, s + l))).filter(m -> (m > k)).mapToInt(e -> e).toArray();
        return answer;
    }
}