class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        long cnt = 0;
        while(cnt < count){
            cnt++;
            sum += price * cnt;
        }
        if(money >= sum){
            answer = 0;
        }else
        answer = sum - money;
        
        return answer;
    }
}