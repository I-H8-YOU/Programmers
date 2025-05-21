import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long compare = Long.parseLong(p);
        int len = p.length();
        StringBuilder sb = new StringBuilder();
        String[] sArr = t.split("");
        for(int i = 0 ; i <= sArr.length - len ; i++){
            sb.setLength(0);
            sb.append(sArr[i]);
            for(int k = i + 1 ; k < i + len ; k++){
                sb.append(sArr[k]);
            }
            if(Long.parseLong(sb.toString()) <= compare){
                answer++;
            }
        }
        return answer;
    }
}