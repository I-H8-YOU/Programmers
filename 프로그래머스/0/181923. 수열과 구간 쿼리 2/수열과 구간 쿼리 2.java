import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        List<Integer> nList = new ArrayList<>();
        int num = 0;
        int cnt = 0;
        for(int l = 0 ; l < queries.length ; l++){
            num = 0;
            nList.clear();
            int s = queries[l][0];
            int e = queries[l][1];
            int k = queries[l][2];
            for(int i = s ; i <= e ; i++){
                if(arr[i] > k){
                    num = arr[i];
                    nList.add(arr[i]);
                }
            }
            if(num == 0){
                answer[l] = -1;
            }else{
                answer[l] = nList.stream().mapToInt(n -> n).min().getAsInt();
            }
        }
        return answer;
    }
}