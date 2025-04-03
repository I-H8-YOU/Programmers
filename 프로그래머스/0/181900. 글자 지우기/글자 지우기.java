class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] sArr = my_string.split("");
        for(int i : indices){
            sArr[i] = "";
        }
        answer = String.join("",sArr);
        return answer;
    }
}