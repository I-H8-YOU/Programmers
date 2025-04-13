class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        if(num == 1) answer = -1;
        if(num != 1){
        while(num != 1){
            if(cnt == 401) break;
            if(num % 2 == 0){
                num /= 2;
                cnt++;
            }else{
                num = num * 3 + 1;
                cnt++;
            }
        }
            }
        
        answer = cnt < 400 ? cnt : -1;
        return answer;
    }
}