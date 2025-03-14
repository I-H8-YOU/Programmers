class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String con_even = "";
        String con_odd = "";
        for(int n : num_list){
            if(n % 2 == 0){
                con_even += Integer.toString(n);
            }else con_odd += Integer.toString(n);
        }
        answer = Integer.parseInt(con_even) + Integer.parseInt(con_odd);
        return answer;
    }
}
