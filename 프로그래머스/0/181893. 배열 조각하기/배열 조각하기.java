import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> nList = new LinkedList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        for(int i = 0 ; i < query.length ; i++){
            if(i % 2 == 0){
                int idx = query[i];
                while(nList.size() > idx + 1){
                    nList.remove(nList.size() - 1);
                }
            }else{
                int idx = query[i];
                for(int k = idx - 1 ; k > -1 ; k--){
                    nList.remove(k);
                }
            }
        }
            int[] answer = nList.stream().mapToInt(n -> n).toArray();
        return answer;
    }
}