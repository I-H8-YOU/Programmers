import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        // String trimmed = s.trim();
        String[] sArr = s.split(" ", -1);
        String[] sArr1 = Arrays.stream(sArr).map(m -> {
            String[]str = m.split("");
            String ret = "";
            for(int i = 0 ; i < str.length ; i++ ){
                if(i % 2 == 0){
                    ret += str[i].toUpperCase();
                }else{
                    ret += str[i].toLowerCase();
                }
            }
            return ret;
        }).toArray(String[]::new);
        answer = String.join(" ",sArr1);
        return answer;
    }
}