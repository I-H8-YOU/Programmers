import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        List<String> sList = new LinkedList<>(Arrays.asList(str_list));
        List<String> sList1 = new ArrayList<>();
        int idxL = sList.indexOf("l");
        int idxR = sList.indexOf("r");
        if(idxL == -1 && idxR == -1){
            return answer;
        }else if(idxL < idxR && idxR != -1 && idxL != -1){
            for(int i = 0 ; i < idxL ; i++){
                sList1.add(str_list[i]);
            }
            if(sList1.size() >= 1){
                 return answer = sList1.stream().toArray(String[]::new);
            }else{
                return answer;
            }
        }else if(idxL > idxR && idxL != -1 && idxR != -1){
             for(int i = idxR + 1 ; i < str_list.length ; i++){
                sList1.add(str_list[i]);
            }
            if(sList1.size() >= 1){
                 return answer = sList1.stream().toArray(String[]::new);
            }else{
                return answer;
            }
        }else if(idxR == -1 && idxL >= 0){
            for(int i = 0 ; i < idxL ; i++){
                sList1.add(str_list[i]);
            }
            if(sList1.size() >= 1){
                 return answer = sList1.stream().toArray(String[]::new);
            }else{
                return answer;
            }
        }else if(idxL == -1 && idxR >= 0){
            for(int i = idxR + 1 ; i < str_list.length ; i++){
                sList1.add(str_list[i]);
            }
                 return answer = sList1.stream().toArray(String[]::new);
            
        }else{
            return answer;
        }
    }
}