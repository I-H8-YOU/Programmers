import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] nArr = new int[arr.length];
        while(true){
            if(answer == 0){
                nArr = Arrays.copyOf(arr, arr.length);
                answer++;
            }
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] = arr[i] / 2;
                }else if(arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
             if(answer > 0 && !Arrays.equals(nArr,arr)){
                answer++;
                nArr = Arrays.copyOf(arr,arr.length);
            }else if(answer > 0 && Arrays.equals(nArr,arr)){
                break;
            }
        }
        return answer - 1;
    }
}