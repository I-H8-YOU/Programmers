import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> nList = new ArrayList<>();
        nList.add(n);
        while(n!=1){
            if(n % 2 == 0){
                n /= 2;
                nList.add(n);
            }else{
                n = 3 * n + 1;
                nList.add(n);
            }
        }
              int[] answer = nList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}