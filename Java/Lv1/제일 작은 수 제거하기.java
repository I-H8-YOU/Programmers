import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int dx = 0;
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            List<Integer> nList = new ArrayList<>();
            for(int i = 0 ; i < arr.length ; i++){
                nList.add(arr[i]);
            }
            // answer = new int[arr.length - 1];
            int minVal = Arrays.stream(arr).min().getAsInt();
            int idx = nList.indexOf(minVal);
            nList.remove(idx);
            answer = nList.stream().mapToInt(i -> i).toArray();
            // for(int i = 0 ; i < answer.length ; i++){
            //     if(arr[i] != minVal){
            //         answer[dx] = arr[i];
            //         dx++;
            //     }else continue;
            // }
        }
        return answer;
    }
}
