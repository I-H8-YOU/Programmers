import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        //String chk = "1,2,3,4,6,7,8,9";
      //  String[] sList = {"1","2","3","4","6","7","8","9"};
            answer = IntStream.rangeClosed(l,r).map(m -> {
            String s = Integer.toString(m);
            if(s.matches("[05]+")) return Integer.parseInt(s);
            else return 0;
        }).filter(f -> f > 0).toArray();
        if(answer.length == 0){
            answer = new int[]{-1};
        }
        return answer;
    }
}