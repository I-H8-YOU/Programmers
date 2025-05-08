class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0 ; i < number.length - 2 ; i++){
            for(int k = i + 1 ; k < number.length ; k++){
                for(int l = k + 1; l < number.length ; l++){
                    if(number[i] + number[k] + number[l] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}