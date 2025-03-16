import java.util.*;
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        List<String> sList = new ArrayList<>();
        String[] s1 = str1.split("");
        String[] s2 = str2.split("");
        for(int i = 0 ; i < s1.length ; i ++){
            sList.add(s1[i]);
            sList.add(s2[i]);
        }
        for(String s : sList){
            answer += s;
        }
        return answer;
    }
}
