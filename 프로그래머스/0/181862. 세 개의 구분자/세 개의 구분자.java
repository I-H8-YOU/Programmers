import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        String str = myStr.replaceAll("[abc]", "");
        if(str.length() == 0){
            answer = new String[]{"EMPTY"};
        }else if(str.length() == 1){
            answer = new String[]{str};
        }else{
            List<String> sList = new ArrayList<>();
            String[] sArr = myStr.split("[abc]");
            for(String s : sArr){
                if("".equals(s)){
                    continue;
                }else{
                    sList.add(s);
                }
            }
            answer = sList.stream().toArray(String[]::new);
        }
        return answer;
    }
}