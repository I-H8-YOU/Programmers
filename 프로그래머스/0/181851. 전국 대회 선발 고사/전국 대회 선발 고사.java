import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> nList = new ArrayList<>();
        for(int i = 0 ; i < rank.length ; i++){
            if(attendance[i] == true){
                nList.add(rank[i]);
            }else{
                continue;
            }
        }
        int[] rankArr = new int[3];
        for(int k = 0 ; k < 3 ; k++){
            int min = nList.stream().mapToInt(n -> n).min().getAsInt();
            rankArr[k] = Arrays.stream(rank).boxed().collect(Collectors.toList()).indexOf(min);
            nList.remove(Integer.valueOf(min));
            
        }
        answer = 10000 * rankArr[0] + 100 * rankArr[1] + rankArr[2];
        return answer;
    }
}