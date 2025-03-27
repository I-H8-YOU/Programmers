import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> nList = new ArrayList<>();
        for(int i : arr){
            if(i % divisor == 0){
                nList.add(i);
            }else continue;
        }
        
        if(nList.size() != 0){
            answer = nList.stream().mapToInt(i -> i).toArray();
            Arrays.sort(answer);
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}