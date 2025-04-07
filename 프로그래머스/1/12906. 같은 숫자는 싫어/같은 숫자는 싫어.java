import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> nList = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(i == arr.length - 1){
                if(arr[i] != arr[i - 1]){
                    nList.add(arr[i]);
                }else{
                    nList.add(arr[i]);
                }
            }
            if(i+1 < arr.length){
            if(arr[i] != arr[i+1]){
                nList.add(arr[i]);
            }else{
                continue;
            }
            }
        }
        int[] answer = nList.stream().mapToInt(n -> n).toArray();

        return answer;
    }
}