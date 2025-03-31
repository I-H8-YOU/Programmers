import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int cnt = 0;
        List<Integer> nList = new ArrayList<>();
        External : for(int i = 1; i <= 10000;i++){
            if(n % i == 0 ){
                nList.add(i);
            }else continue;
        }
        answer = nList.stream().sorted().mapToInt(k -> k).toArray();
        return answer;
    }
}