import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] stringNums = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        Arrays.sort(stringNums, (a, b) -> (b + a).compareTo(a + b));
        if(stringNums[0].equals("0")){
            return "0";
        }else{
            for(String s : stringNums){
                sb.append(s);
            }
            return sb.toString();
        }
    }
}