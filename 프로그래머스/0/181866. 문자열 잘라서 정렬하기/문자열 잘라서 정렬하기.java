import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String[] sArr = myString.split("x",-1);
        List<String> sList = new ArrayList<>();
        for(int i = 0 ; i < sArr.length ; i++){
            if(!(sArr[i].equals(" ") || sArr[i].equals(""))){
                sList.add(sArr[i]);
            }else continue;
        }
        answer = sList.stream().toArray(String[]::new);
        Arrays.sort(answer);
        return answer;
    }
}