class Solution {
    public int[][] solution(int[] num_list, int n) {
        int cnt = 0;
        int[][] answer = new int[num_list.length / n][n];
        for(int i = 0 ; i < answer.length ; i++){
            for(int k = 0 ; k < answer[i].length ; k++){
                answer[i][k] = num_list[cnt];
                cnt++;
            }
        }
        return answer;
    }
}
