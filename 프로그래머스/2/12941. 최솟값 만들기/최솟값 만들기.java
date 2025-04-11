import java.util.*;
import java.util.stream.Collectors;
class Solution
{
    public int solution(int []A, int []B)
    {
        //  List<Integer> aList = Arrays.stream(A).boxed().sorted().collect(Collectors.toList());
        // List<Integer> bList = Arrays.stream(B).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        // aList.sort(Comparator.naturalOrder());
        // bList.sort(Comparator.reverseOrder());
        for(int i = 0 ; i < A.length; i++){
          answer += A[i] * B[B.length - 1 - i];
        }
        return answer;
    }
}