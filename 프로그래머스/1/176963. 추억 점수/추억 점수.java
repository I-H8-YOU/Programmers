import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int sum = 0;
        Map<String,Integer> pMap = new HashMap<>();
        for(int i = 0 ; i < name.length ; i++){
            pMap.put(name[i],yearning[i]);
        }
        for(int k = 0 ; k < photo.length ; k++){
            sum = 0;
            for(int l = 0 ; l < photo[k].length ; l++){
                if(pMap.containsKey(photo[k][l])){
                    sum += pMap.get(photo[k][l]);
                }else{
                    continue;
                }
            }
            answer[k] = sum;
        }
        return answer;
    }
}