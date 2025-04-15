class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] qrArr = code.split("");
        for(int i = 0 ; i < qrArr.length ; i++){
            if(i % q == r){
                answer += qrArr[i];
            }else continue;
        }
        return answer;
    }
}