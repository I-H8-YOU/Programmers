class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int cnt = 0;
        for(int i : numlist){
            if(i % n == 0){
                cnt++;
            }
        }
        answer = new int[cnt];
        int add = 0;
        for(int k : numlist){
            if(k % n == 0){
                answer[add] = k;
                add++;
            }
        }
        return answer;
    }
}
