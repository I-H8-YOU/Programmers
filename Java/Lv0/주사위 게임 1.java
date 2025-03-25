class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a % 2 != 0 && b % 2 !=0){
            answer = (int)Math.pow(a, 2) + (int)Math.pow(b, 2);
        }else if(a % 2 != 0 || b % 2 !=0){
            answer = 2 * (a + b);
        }else{
            if(a - b < 0){
                answer =  (a - b) * -1;
            }else{
                answer = a - b;
            }
        }
        return answer;
    }
}
