import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> nSet = new HashSet<>();
        for(int i = 0 ; i < numbers.length - 1 ; i++){
            for(int k = i + 1 ; k < numbers.length; k++){
                nSet.add(numbers[i] + numbers[k]);
            }
        }
        int[] answer = new int[nSet.size()];
        List<Integer> nList = new ArrayList<>();
        Iterator<Integer> ir = nSet.iterator();
        while(ir.hasNext()){
            nList.add(ir.next());
        }
        Collections.sort(nList);
        return nList.stream().mapToInt(n -> n).toArray();
    }
}