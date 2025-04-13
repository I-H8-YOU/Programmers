class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
            int sum = 0;
            int chk = 1;
            for(int i = 1 ; i <= n ; i++ , chk++){
                        sum = 0;
                    for(int k = i ; sum <= n ; k++){
                        sum += k;
                        if(sum == n){
                            cnt++;
                            break;
                        }
                    }
                }
         answer = cnt;
        return answer;
    }
}