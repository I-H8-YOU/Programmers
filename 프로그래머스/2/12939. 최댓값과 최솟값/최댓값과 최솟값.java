import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        List<Integer> nList = new ArrayList<>();
        for(String s1 : sArr){
            nList.add(Integer.valueOf(s1));
        }
        int min = nList.stream().mapToInt(i -> i).min().getAsInt();
        int max = nList.stream().mapToInt(i -> i).max().getAsInt();
        if(max > 0){
            answer = Integer.toString(min);
            answer += " ";
            answer += Integer.toString(max);
        }else if(max < 0){
            answer = Integer.toString(min);
            answer += " ";
            answer += Integer.toString(max);
        }
        return answer;
    }
}