import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0 ; i < babbling.length ; i++){
            String str = babbling[i];
            if (str.contains("ayaaya") || str.contains("yeye") || 
                str.contains("woowoo") || str.contains("mama")) {
                continue;  
            }
            for(int k = 0 ; k < 10 ; k++){
                str = str.replaceFirst("aya","1");
                str = str.replaceFirst("ye","1");
                str = str.replaceFirst("woo","1");
                str = str.replaceFirst("ma","1");
            }
                
            str = str.replace("1","");
            if(str.equals("")){
                answer += 1;
            }
        }
        return answer;
    }
}