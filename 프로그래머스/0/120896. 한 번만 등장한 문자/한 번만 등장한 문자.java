import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = Arrays.stream(s.split("")).filter(c -> s.indexOf(c) == s.lastIndexOf(c)).sorted().toArray(String[]::new);
        answer = String.join("",sArr);
        return answer;
    }
}