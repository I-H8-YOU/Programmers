import java.util.*;
class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        String[] sArr1 = new String[s.length()];
        Arrays.sort(sArr);
        int idx = 0;
        for(int i = sArr.length - 1 ; i > -1 ; i--){
            sArr1[idx] = sArr[i];
            idx++;
        }
        String answer = String.join("", sArr1);
        return answer;
    }
}