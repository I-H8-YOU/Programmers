class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int cnt = 0;
        int add = 0;
        for(int i = 1; i <= n ; i++){
            if(i % 2 != 0){
                cnt++;
            }
        }
        answer = new int[cnt];
        for(int k = 1; k <= n ; k++){
            if(k % 2 != 0){
                answer[add] = k;
                add++;
            }
        }
        return answer;
    }
}
