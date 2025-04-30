import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> nList = new ArrayList<>(); 
        int i = 0;
         while(i < arr.length){
             if(i < arr.length){
            if(nList.isEmpty()){
                nList.add(arr[i]);
                i++;
            }else{
                if(nList.get(nList.size() - 1) == arr[i]){
                    nList.remove(nList.size() - 1);
                    i++;
                }else{
                    nList.add(arr[i]);
                    i++;
                }
            }
        }
         }
        if(nList.size() > 0){
            int[] answer = nList.stream().mapToInt(n -> n).toArray();
            return answer;
        }else{
            int[] answer = {-1};
            return answer;
        }
    }
}