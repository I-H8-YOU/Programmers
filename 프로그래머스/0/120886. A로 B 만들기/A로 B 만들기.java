import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int idx = 0;
        String[] sArr = before.split("");
        List<String> sList = new LinkedList<>(Arrays.asList(after.split("")));
        for(int i = 0 ; i < before.length(); i++){
            for(int k = 0 ; k < sList.size() ; k++){
                if(sArr[i].equals(sList.get(k))){
                    sList.remove(k);
                    break;
                }else continue;
            }
        }
        if(sList.size() > 0){
            answer = 0;
        }else if(sList.size() == 0){
            answer = 1;
        }
        return answer;
    }
}