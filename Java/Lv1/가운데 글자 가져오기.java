class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        if(s.length() % 2 == 0){
            for(int i = sArr.length / 2 - 1; i < sArr.length / 2 + 1 ; i++){
                answer += sArr[i];
            }
        }else{
            answer = sArr[sArr.length / 2];
        }
        return answer;
    }
}
