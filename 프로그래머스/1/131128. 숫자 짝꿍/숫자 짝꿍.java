import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        boolean chk = false;
        List<Integer> nList = new ArrayList<>();
        char[] cArr = X.toCharArray();
        int[] nArr = new int[10];
        for(char c : Y.toCharArray()){
            nArr[c - '0']++;
        }
        for(int i = 0 ; i < cArr.length ; i++){
            int num = cArr[i] - '0';
            if(nArr[num] > 0){
                chk = true;
                nList.add(num);
                nArr[num]--;
            }
        }
       if (chk) {
            nList.sort(Comparator.reverseOrder());
            if (nList.get(0) == 0) return "0";

            StringBuilder sb = new StringBuilder();
            for (int n : nList) {
                sb.append(n);
            }
            return sb.toString();
        } else {
            return "-1";
        }
    }
}