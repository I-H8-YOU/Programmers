import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> nList = Arrays.stream(emergency).boxed().collect(Collectors.toList());
        int cnt = 1;
            for(int i = 0 ; i < emergency.length ; i++){
            int max = Arrays.stream(emergency).max().getAsInt();
                int idx = nList.indexOf(max);
                emergency[idx] = -1;
            answer[idx] = cnt;
            cnt++;
        }
      
        
        return answer;
    }
}