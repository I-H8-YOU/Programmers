import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] diceArr = {a,b,c,d};
        Set<Integer> nSet = new HashSet<>();
        List<Integer> nList = new ArrayList<>();
        for(int i : diceArr){
            nSet.add(i);
            nList.add(i);
        }
        if(nSet.size() == 1){
            answer = 1111 * a;
        }else if(nSet.size() == 4){
            answer = nList.stream().mapToInt(n -> n).min().getAsInt();
        }else if(nSet.size() == 3){
            for(int i = 0 ; i < diceArr.length ; i++){
                if(nList.indexOf(diceArr[i]) != nList.lastIndexOf(diceArr[i])){
                    nList.remove(Integer.valueOf(diceArr[i]));
                    nList.remove(Integer.valueOf(diceArr[i]));
                    break;
                }
            }
            int ans = 1;
            for(int i = 0 ; i < nList.size() ; i++){
                ans *= nList.get(i);
            }
            answer = ans;
        }else{
            Arrays.sort(diceArr);
            if(diceArr[1] == diceArr[2]){
                int idxNum = 0;
                if(diceArr[1] == diceArr[0]){
                    idxNum = diceArr[3];
                    answer = (int)Math.pow((10 * diceArr[1] + idxNum), 2);
                }else{
                    idxNum = diceArr[0];
                    answer = (int)Math.pow((10 * diceArr[1] + idxNum), 2);
                }
                
            }else{
                answer = (diceArr[1] + diceArr[2]) * Math.abs(diceArr[1] - diceArr[2]);
            }
        }
        return answer;
    }
}