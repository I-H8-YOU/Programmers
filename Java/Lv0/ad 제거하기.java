import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> sList = new ArrayList<String>();
        for(String s : strArr){
            if(s.contains("ad")){
                continue;
            }else{
                sList.add(s);
            }
        }
        String[] answer = sList.toArray(new String[0]);
        return answer;
    }
}
