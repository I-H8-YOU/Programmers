class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int len = num_list.length;
        if(len >= 11){
            for(int n : num_list){
                answer += n;
            }
        }else{
           for(int i : num_list){
               multi *= i;
           } answer = multi;
        }
        return answer;
    }
}
