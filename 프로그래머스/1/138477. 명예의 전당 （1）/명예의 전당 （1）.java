import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> nList = new ArrayList<>();
        for(int i = 0 ; i < score.length ; i++){
            nList.add(score[i]);
            if(nList.size() > k){
                int min = Collections.min(nList);
                nList.remove(Integer.valueOf(min));
            }
            answer[i] = Collections.min(nList);
        }
        return answer;
    }
}