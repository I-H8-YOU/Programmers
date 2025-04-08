class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] alpha = myString.toCharArray();
        String[] sArr = myString.split("");
        for(int i = 0 ; i < myString.length() ; i++){
            if(alpha[i] < 108){
                sArr[i] = "l";
            }else continue;
        }
        answer = String.join("", sArr);
        return answer;
    }
}