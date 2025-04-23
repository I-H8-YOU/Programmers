import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        List<Integer> nList = new LinkedList<>();
        nList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        if(direction.equals("right")){
            int num = numbers[numbers.length - 1];
            nList.remove(numbers.length -1);
            nList.add(0,num);
        }else{
            int num = numbers[0];
            nList.remove(0);
            nList.add(num);
        }
        answer = nList.stream().mapToInt(Integer::valueOf).toArray();
        return answer;
    }
}