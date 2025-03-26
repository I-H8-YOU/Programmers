import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] sArr = (Integer.toString(n)).split("");
        answer = Arrays.stream(sArr).mapToInt(i -> Integer.parseInt(i)).sum();
        return answer;
    }
}
