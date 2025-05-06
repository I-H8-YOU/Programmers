import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        boolean chk = false;
        List<Boolean> bList = new ArrayList<>();
        for(int i = 0 ; i < dic.length ; i++){
            chk = false;
            for(int k = 0 ; k < spell.length ; k++){
                if(dic[i].contains(spell[k])){
                    chk = true;
                }else{
                    chk = false;
                    break;
                }
            }
            bList.add(chk);
        }
        if(bList.stream().anyMatch(m -> m == true)){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}