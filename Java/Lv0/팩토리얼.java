class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        int math = 1;
        for(int i = 1 ; i < 1000 ; i++){
            math *= i;
            if(math <= n){
                cnt++;
            }else{
                answer = cnt;
                break;
            }
        }
        return answer;
    }
}
