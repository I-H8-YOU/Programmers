import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] sArr = my_string.split("");
        for(int i = c-1 ; i< my_string.length() ; i += m){
            answer += sArr[i];
        }
        return answer;
    }
}