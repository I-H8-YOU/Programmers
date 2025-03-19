class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int cnt = 0;
        for(int i = 1 ; i < 100 ; i++){
            if(slice * i >= n){
                cnt = i;
                break;
            }
        }
        answer = cnt;
        return answer;
    }
}
