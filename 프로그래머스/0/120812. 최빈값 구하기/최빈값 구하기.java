import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int[] nArr = new int[1000];
        for(int i = 0 ; i < array.length ; i++){
            int idx = array[i];
            int cnt = nArr[idx];
            cnt++;
            nArr[idx] = cnt; 
        }
        // System.out.println(Arrays.toString(nArr));
        List<Integer> nList = new ArrayList<>();
        nList = Arrays.stream(nArr).boxed().collect(Collectors.toList());
        int max = nList.stream().mapToInt(n -> n).max().getAsInt();
        if(nList.indexOf(max) == nList.lastIndexOf(max)){
            answer = nList.lastIndexOf(max);
        }else{
            answer = -1;
        }
        return answer;
    }
}