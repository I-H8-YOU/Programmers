import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for(int i = 0 ; i < picture.length ; i++){
            String str = picture[i];
            picture[i] = String.join("",Arrays.stream(str.split("")).map(m -> m.repeat(k)).toArray(String[]::new));
        }
        int cnt = 0;
        for(int i = 0 ; i < answer.length ; i++){
            if(i % k == 0 && i != 0){
                cnt++;
                answer[i] = picture[cnt];
            }else{
                answer[i] = picture[cnt];
            }
        }
        return answer;
    }
}