class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] sArr = cipher.split("");
        for(int i = code - 1 ; i < sArr.length ; i += code){
            if(i < sArr.length){
                answer += sArr[i];
            }
        }
        return answer;
    }
}
