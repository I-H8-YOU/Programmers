import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        String[] sArr = s.split("");
        int[] nArr = new int[sArr.length];
        for(int i = 0 ; i < sArr.length ; i++){
                    nArr[i] = Integer.parseInt(sArr[i]);         
            }
        Arrays.sort(nArr); // wrapper 클래스 사용 필요 Collections.reverseOrder()
        int[] nArr2 = new int[nArr.length];
        String res = "";
        int idx = 0;
        for(int l = nArr.length - 1 ; ; l--){
            nArr2[idx] = nArr[l];
            idx++;
            if(l == 0){
                break;
            }
        }
        for(int k : nArr2){
            res += Integer.toString(k);
        }
        answer = Long.parseLong(res);
        return answer;
    }
}
