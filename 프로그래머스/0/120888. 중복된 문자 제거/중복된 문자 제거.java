import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<String> strSet = new LinkedHashSet<>();
        String[] sArr = my_string.split("", -1);
        for(int i = 0 ; i < sArr.length ; i++){
            if (!sArr[i].equals("")) {
                strSet.add(sArr[i]);
            }
        }
        List<String> sList = new ArrayList<>(strSet);
        return String.join("",sList);
    }
}