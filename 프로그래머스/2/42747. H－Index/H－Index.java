import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        List<Integer> nList = Arrays.stream(citations).boxed().collect(Collectors.toList());
        nList.sort(Comparator.reverseOrder());
        System.out.println(nList);
        for(int i = 0 ; i < nList.size() ; i++){
            if(nList.get(i) >= i + 1){
                answer++;
            }else{
                break;
            }
        }
        return answer;
    }
}