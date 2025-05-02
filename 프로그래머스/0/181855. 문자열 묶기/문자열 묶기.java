import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] nArr = new int[30];
        for(int i = 0 ; i < strArr.length ; i++){
            nArr[strArr[i].length() - 1]++;
        }
        answer = Arrays.stream(nArr).boxed().collect(Collectors.toList()).stream().mapToInt(n -> n).max().getAsInt();
        return answer;
    }
}