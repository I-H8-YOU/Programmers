class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int coupon = chicken;
        while(coupon >= 10){
            int free =  coupon / 10;
            answer += free;
            coupon = coupon % 10 + free;
        }
        return answer+1;
    }
}