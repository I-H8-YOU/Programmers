class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        for(int i = 1; i <= n ; i++){
            cnt = 0;
            for(int k = 1 ; k <= 100 ; k++){
                if(i % k == 0){
                    cnt++;
                }
            }
            if(cnt >= 3){
                answer++;
            }
        }
        return answer;
    }
}