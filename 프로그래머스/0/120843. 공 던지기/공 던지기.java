class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int i = 0;
        int cnt = 0;
        while(true){
            i = (i + 2) % numbers.length;
            answer = numbers[i];
            cnt++;
            if(cnt == k - 1){
                break;
            }
        }
        return answer;
    }
}