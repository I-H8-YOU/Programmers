class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = fibo(0,1,n,2);
        return answer;
    }
    private int fibo(int a , int b , int n , int cnt){
        int sum = (a + b) % 1234567;
        if(cnt == n){
            return sum % 1234567;
        }
        return fibo(b, sum, n , cnt + 1);
    }
}