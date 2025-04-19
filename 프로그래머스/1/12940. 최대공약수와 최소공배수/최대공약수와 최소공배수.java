class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for(int i = 1 ; i <= 1000 ; i++){
            if(n % i == 0 && m % i == 0){
                answer[0] = i;
            }
        }
        int max = Math.max(n,m);
         while(true){
             if(max % n == 0 && max % m == 0){
                 break;
             }
             max++;
         }
        answer[1] = max;
        return answer;
    }
}