import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> nList = new ArrayList<>();
        int i = 0;
        int size = 0;
        for( ; i < arr.length; ){
            if(size == 0){
                nList.add(arr[i]);
                i++;
                size++;
            }else if(nList.size() > 0 && nList.get(size - 1) < arr[i]){
                nList.add(arr[i]);
                i++;
                size++;
            }else{
                nList.remove(size - 1);
                size--;
            }
        }
         int[] stk = new int[size];
        for (int j = 0; j < size; j++) {
            stk[j] = nList.get(j);
        }
        return stk;
    }
}