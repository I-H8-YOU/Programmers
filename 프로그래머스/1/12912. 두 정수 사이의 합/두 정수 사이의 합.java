import java.util.*;
import java.util.stream.LongStream;
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a < b){
        answer = LongStream.rangeClosed(a,b).sum();
        }else{
        answer = LongStream.rangeClosed(b,a).sum();
        }
        
        return answer;
    }
}