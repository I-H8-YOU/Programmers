import java.util.*;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int range = right - left;
        int copyLeft = left;
        int cnt = 0;
        List<Integer> nList = new ArrayList<>();
        for(int i = 0 ; i < range + 1 ; i++){
            cnt = 0;
            for(int k = 1 ; k < copyLeft ; k++ ){
                if(copyLeft % k == 0){
                    cnt++;
                }
            }
            if(cnt % 2 == 0){
             answer += copyLeft * -1;   
            }else{
                answer -= copyLeft * -1;
            }
            copyLeft++;
            // nList.add(cnt+1);
            
        }
        // int idx = 0;
        // for(int m = left ; m <= right ; m++){
        //     if(nList.get(idx) % 2 == 0){
        //         answer += m;
        //         idx++;
        //     }else{
        //         answer -= m;
        //         idx++;
        //     }
        // }
        return answer;
    }
}