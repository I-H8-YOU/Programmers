import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        Set<Integer> nSet = new LinkedHashSet<>();
          String str = s.replaceAll("^\\{\\{", "").replaceAll("}}$", "");
          String[] sArr = str.split("\\},\\{");
        Arrays.sort(sArr, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        for(int i = 0 ; i < sArr.length ; i++){
            if(sArr[i].length() == 1){
                nSet.add(Integer.parseInt(sArr[i]));
            }else{
                String[] sArr1 = sArr[i].split(",");
                for(int k = 0 ; k < sArr1.length ; k++){
                    nSet.add(Integer.parseInt(sArr1[k]));
                }
            }
        }
        List<Integer> nList = new ArrayList<>(nSet);
        answer = nList.stream().mapToInt(n -> n).toArray();
        return answer;
    }
}