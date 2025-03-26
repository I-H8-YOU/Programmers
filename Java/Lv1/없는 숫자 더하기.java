import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> nList = new ArrayList<>();
        for(int i = 0 ; i < numbers.length ; i++){
            nList.add(numbers[i]);
        }
        for(int k = 0 ; k < 10 ; k++){
            boolean chk = nList.contains(k);
            if(chk){
                continue;
            }else{
                answer += k;
            }
        }
        return answer;
    }
}
