class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1]; //길이 4
        for(int i = 0 ; i < answer.length ; i++){ // 0, 1, 2, 3 실행
            if(i != answer.length - 1){
                answer[i] = num_list[i];
            }else{
                if(num_list[i-1] > num_list[i-2]){
                    answer[i] = num_list[i-1] - num_list[i-2];
                }else{
                    answer[i] = num_list[i-1] * 2; 
                }
            }
        }
        
        return answer;
    }
}
