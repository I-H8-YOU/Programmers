import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> nList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> nList1 = new LinkedList<>();
        if(nList.contains(2)){
            if(nList.indexOf(2) == nList.lastIndexOf(2)){
                answer = new int[1];
                answer[0] = 2;
            }else{
                for(int i = nList.indexOf(2) ; i <= nList.lastIndexOf(2) ; i++){
                    nList1.add(arr[i]);
                }
                answer = nList1.stream().mapToInt(Integer::intValue).toArray();
            }
        }else if(!nList.contains(2)){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}