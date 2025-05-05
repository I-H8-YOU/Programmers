import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
         // String burgers = String.join("",Arrays.stream(ingredient).mapToObj(Integer::toString).toArray(String[]::new));
        StringBuilder sb1 = new StringBuilder();
        for(int i = 0 ; i < ingredient.length ; i++){
            sb1.append(Integer.toString(ingredient[i]));
        }
        String burgers = sb1.toString();
        StringBuilder sb = new StringBuilder(burgers);
        if(burgers.contains("1231")){
            while(true){
               int idx = sb.indexOf("1231");
                if (idx == -1) break;
                sb.delete(idx, idx + 4);
                answer++;
            }
            return answer;
        }else{
            return answer = 0;
        }
    }
}