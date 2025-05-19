import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] sArr = s.split("");
        int[] answer = new int[sArr.length];
        List<String> sList = new ArrayList<>();
        for(int i = 0 ; i < sArr.length ; i++){
            String str = sArr[i];
            int idx = sList.lastIndexOf(str);
            if(idx == -1){
                answer[i] = -1;
            }else{
                answer[i] = i - idx;
            }
            sList.add(str);
        }
        return answer;
    }
}