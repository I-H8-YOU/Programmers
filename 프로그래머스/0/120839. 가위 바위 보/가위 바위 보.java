class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] sArr = rsp.split("");
        for(int i = 0 ; i < sArr.length ; i++){
            if(sArr[i].equals("2")){
                answer += "0";
            }else if(sArr[i].equals("0")){
                answer += "5";
            }else{
                answer += "2";
            }
        }
        return answer;
    }
}