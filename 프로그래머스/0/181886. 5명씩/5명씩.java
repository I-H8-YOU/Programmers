import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        List<String> sList = new ArrayList<>();
        int cnt = 0;
        for(int i = 0 ; i < names.length ; i++){
            if(i==0){
                sList.add(names[i]);
                
            }else if(i % 5 == 0){
                sList.add(names[i]);
            }
        }
        String[] answer = sList.toArray(String[]::new);
        return answer;
    }
}