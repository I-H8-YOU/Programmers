import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 0 ; i < food.length ; i++){
            food[i] = food[i] - (food[i] % 2);
        }
        StringBuilder sb = new StringBuilder();
        for(int k = 1 ; k < food.length ; k++){
            int div = food[k] / 2;
            for(int l = 0 ; l < div ; l++){
                sb.append(k);
            }
        }
        answer = sb.toString() + 0 + sb.reverse().toString();
        return answer;
    }
}