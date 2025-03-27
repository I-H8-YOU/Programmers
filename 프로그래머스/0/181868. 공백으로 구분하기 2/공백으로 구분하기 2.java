import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = Arrays.stream(my_string.trim().split("\\s+")).toArray(String[]::new);
        
        return answer;
    }
}