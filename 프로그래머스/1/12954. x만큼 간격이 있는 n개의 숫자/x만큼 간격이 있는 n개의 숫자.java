class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long res = 0;
        for(int i = 0 ; i < n ; i++){
            res += x;
            answer[i] =res;
        }
        //
        return answer;
    }
}
