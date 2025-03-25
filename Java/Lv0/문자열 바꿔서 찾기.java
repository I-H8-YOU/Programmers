import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        List<String> sList = new ArrayList<>();
        String[] sArr = myString.split("");
        for(String s : sArr){
            if(s.equals("A")){
                sList.add("B");
            }else{
                sList.add("A");
            }
        }
        String res = String.join("", sList);
        answer = res.contains(pat) ? 1 : 0;
        return answer;
    }
}
