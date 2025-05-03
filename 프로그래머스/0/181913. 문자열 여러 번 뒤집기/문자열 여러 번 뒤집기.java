import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        List<String> sList = new ArrayList<>();
        StringBuilder sb = new StringBuilder(my_string);
        for(int i = 0 ; i < queries.length ; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            String[] sArr = (sb.substring(s,e+1)).split("");
            sList = Arrays.asList(sArr);
            Collections.reverse(sList);
            String reversed = String.join("",sList);
            String original = String.join("", sArr);
            sb.replace(s,e+1, reversed);
        }
        answer = sb.toString();
        return answer;
    }
}