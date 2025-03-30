import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] sArr = my_string.chars().mapToObj(c -> {
            char ch = (char)c;
            if(Character.isUpperCase(ch)){
               return String.valueOf(Character.toLowerCase(ch));
            }else{
              return String.valueOf(Character.toUpperCase(ch));
            }
        }).toArray(String[]::new);
        answer = String.join("", sArr);
        return answer;
    }
}