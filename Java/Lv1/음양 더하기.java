class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int neg = -1;
        for(int i = 0 ; i < signs.length ; i ++){
            if(signs[i] == true){
                answer += absolutes[i]; //비교
            }else if(signs[i] == false){
                answer += absolutes[i] * neg;
            }
        }
        return answer;
    }
}
