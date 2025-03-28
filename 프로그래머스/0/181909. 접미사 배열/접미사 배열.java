import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        List<String> sList = new ArrayList<>();
        for(int i = 0 ; i < my_string.length() ; i++){
            sList.add(my_string.substring(i));
        }
        answer = sList.stream().toArray(String[]::new);
        Arrays.sort(answer);
        return answer;
    }
}