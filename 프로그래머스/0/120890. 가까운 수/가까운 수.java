import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        List<Integer> nList = new ArrayList<>();
        for(int i : array){
            int sub = 0;
            int max = Math.max(i,n);
            if(max == n){
                sub = n - i;
                nList.add(sub);
            }else{
                sub = i - n;
                nList.add(sub);
            }
        }
        answer = array[nList.indexOf(nList.stream().mapToInt(k -> k).min().getAsInt())];
        return answer;
    }
}