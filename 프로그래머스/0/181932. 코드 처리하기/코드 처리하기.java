import java.util.*;
class Solution {
    public String solution(String code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        char[] cArr = code.toCharArray();
        for(int i = 0 ; i < cArr.length ; i++){
            if(cArr[i] == '1'){
                if(mode == 0){
                    mode = 1;
                }else{
                    mode = 0;
                }
                
            }
            if(cArr[i] != '1' && i % 2 == 0 && mode == 0){
                sb.append(cArr[i]);
            }else if(cArr[i] != '1' && i % 2 != 0 && mode == 1){
                sb.append(cArr[i]);
            }
        }
        answer = sb.toString();
        if(answer.equals("")){
            answer = "EMPTY";
        }
        return answer;
    }
}