import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> nList = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            nList.add(arr[i]);
        }
        for(int k = 0 ; k < delete_list.length ; k++){
            boolean chk = nList.contains(Integer.valueOf(delete_list[k]));
            if(chk) {
            	int idx = nList.indexOf(delete_list[k]);
            	nList.remove(idx);
            }
        }
        answer = nList.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}
