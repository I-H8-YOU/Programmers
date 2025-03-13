class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum = 0;
        int cnt = 0;
        do{
            sum += numbers[cnt];
            cnt++;
        }while(sum <= n);
        answer = sum;
        return answer;
    }
}
