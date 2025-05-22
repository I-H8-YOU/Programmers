import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] nArr = { 1, 2, 3, 4, 5 };
        int[] nArr1 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] nArr2 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int[] scoreArr = new int[3];
        for(int i = 0 ; i < answers.length ; i++){
            if(answers[i] == nArr[i % nArr.length]){
                scoreArr[0] += 1;
            }
            if(answers[i] == nArr1[i % nArr1.length]){
                scoreArr[1] += 1;
            }
            if(answers[i] == nArr2[i % nArr2.length]){
                scoreArr[2] += 1;
            }
        }
        List<Integer> nList = Arrays.stream(scoreArr).boxed().collect(Collectors.toList());
        List<Integer> nList1 = new ArrayList<>();
        int max = Collections.max(nList);
        for(int i = 0 ; i < 3 ; i++){
            if(scoreArr[i] == max){
                nList1.add(i + 1);
            }else{
                continue;
            }
        }
        System.out.println(nList1);
        answer = nList1.stream().mapToInt(k -> k).toArray();
        return answer;
    }
}