class Solution {
    public int solution(int n) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        if(n % 2 == 0){
            for(int i = 1; i <= n ; i++){
                if(i % 2 == 0){
                    even += (int)Math.pow(i,2);
                }else continue;
            }
            answer = even;
        }else{
            for(int k = 1; k <= n ; k++){
                if(k % 2 != 0){
                    odd += k;
                }else continue;
            }
            answer = odd;
        }
        
        return answer;
    }
}
