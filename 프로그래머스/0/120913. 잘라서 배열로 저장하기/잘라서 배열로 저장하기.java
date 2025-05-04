import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        String[] mArr = my_str.split("");
        List<String> sList = new ArrayList<>();
        if(my_str.length() % n != 0){
            answer = new String[my_str.length() / n + 1];
            int cnt = 0;
            for(int i = 0 ; i < answer.length ; i++){
                if(i == answer.length - 1){
                    answer[i] = my_str.substring(cnt, my_str.length());
                }else{
                   answer[i] = my_str.substring(cnt, cnt+n);
                   cnt += n; 
                }
                
            }
        }else{
            answer = new String[my_str.length() / n];
            int cnt = 0;
            for(int i = 0 ; i < answer.length ; i++){
                answer[i] = my_str.substring(cnt, cnt+n);
                cnt += n;
            }
        }
        return answer;
    }
}