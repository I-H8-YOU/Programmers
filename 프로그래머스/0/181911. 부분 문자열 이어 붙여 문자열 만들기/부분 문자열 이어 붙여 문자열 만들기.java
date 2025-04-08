import java.util.*;
class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        List<String> sList = new ArrayList<>();
        int idx = 0;
        for(int i = 0 ; i < parts.length ; i++){
            String chk = "";
            int n1 = 0;
            int n2 = 0;
            for(int k = 0 ; k < parts[i].length ; k++){
                 n1 = parts[i][k];
                 n2 = parts[i][k+1];
                chk = my_strings[idx].substring(n1,n2+1);
                break;
            }
            idx++;
            sList.add(chk);
        }
        for(String s : sList){
            answer += s;
        }
        return answer;
    }
}