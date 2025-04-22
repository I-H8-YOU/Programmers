import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> nList = new LinkedList<>();
        for(int i = 0 ; i < arr.length ; i++){
            boolean chk = flag[i];
            int num = arr[i];
            if(chk == true){
                for(int k = 0 ; k < num * 2 ; k++){
                    nList.add(num);
                }
            }else{
                for(int k = 0 ; k < num ; k++){
                    nList.remove(nList.size() - 1);
                }
            }
        }
        int[] answer = nList.stream().mapToInt(Integer::valueOf).toArray();
        return answer;
    }
}