class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int min = Math.min(denom1, denom2);
        int divNum = 0;        
        int sameSub = (denom1 * denom2);
        int number1Ch = (denom2 * numer1);
        int number2Ch = (denom1 * numer2);
        int sumTop = (number1Ch + number2Ch);
        int num = Math.max(sameSub, sumTop);
        for(int i = 1 ; i <= num ; i++){
            if(sameSub % i == 0 && sumTop % i == 0){
                divNum = i;
            }
        }
        answer[0] = sumTop / divNum;
        answer[1] = sameSub / divNum;
        return answer;
    }
}