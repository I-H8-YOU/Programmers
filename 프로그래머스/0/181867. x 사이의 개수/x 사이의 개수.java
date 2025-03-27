import java.util.*;
class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] sArr = myString.split("x", -1);
        answer = new int[sArr.length];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = sArr[i].length();
        }
        return answer;
    }
}