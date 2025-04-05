import java.util.*;
class Solution {
    public int solution(String[] order) {
        int answer = Arrays.stream(order).mapToInt(m ->{
            if(m.contains("americano")){
                return 4500;
            }else if(m.equals("anything")){
                return 4500;
            }else{
                return 5000;
            }
        }).sum();
        return answer;
    }
}