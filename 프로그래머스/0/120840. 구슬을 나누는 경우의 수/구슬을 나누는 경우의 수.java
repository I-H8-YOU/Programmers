class Solution {
    public int solution(int balls, int share) {
        double answer = 0;
        double n = fact(balls);
        double m = fact(share); 
        answer = n / (fact(balls - share) * m);
        return (int)Math.round(answer);
    }
    
    public static double fact(int num){
        double res = 1.0;
        for(int i = 1 ; i <= num ; i++){
            res *= i;
        }
        return res;
    }
}