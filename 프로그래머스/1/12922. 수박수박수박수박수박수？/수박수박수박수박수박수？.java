class Solution {
    public String solution(int n) {
        String s = "수";
        String b = "박";
        String answer = "";
        for(int i = 1 ; i <= n ; i++){
            if(i % 2 != 0)answer += s;
            else answer += b;
             
        }
        return answer;
    }
}