import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] sArr = s.split("");
        int cntP = 0;
        int cntY = 0;
        for(String str : sArr){
            if(str.equalsIgnoreCase("p")) cntP++;
            else if(str.equalsIgnoreCase("y")) cntY++;
            else continue;
        }
        answer = cntP == cntY ? true : false;
        return answer;
    }
}