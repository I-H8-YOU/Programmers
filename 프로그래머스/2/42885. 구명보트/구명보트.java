import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        List<Integer> nList = new ArrayList<>();
        for(int n : people){
            nList.add(n);
        }
        int left = 0;
        int right = nList.size() - 1;
        int cnt = 0;
        while(left <= right){
            if(nList.get(left) + nList.get(right) <= limit){
                left++;
            }
            right--;
            answer++;
        }
       
        return answer;
    }
}