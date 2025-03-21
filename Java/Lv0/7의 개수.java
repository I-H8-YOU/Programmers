import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cnt = 0;
        String comb = "";
        List<String> sList = new ArrayList<>();
        for(int n : array){
            sList.add(Integer.toString(n));
        }
        // Iterator ir = sList.iterator();
        // while(ir.hasNext()){
        //     String s = (String)ir.next();
        //     if(s.contains("7")){
        //         cnt++;
        //     }else if(s.equals("77")){
        //         cnt++;
        //     }
        // }
        for(String s : sList){
            comb += s;
        }
        String[] sArr = comb.split("");
        for(String str : sArr){
            if(str.equals("7")){
                cnt++;
            }else continue;
        }
        answer = cnt;
        return answer;
    }
}
