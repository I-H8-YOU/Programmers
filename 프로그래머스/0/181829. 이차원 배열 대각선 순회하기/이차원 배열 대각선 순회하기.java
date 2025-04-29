class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i = 0; i < board.length ; i++){
            for(int m = 0 ; m < board[i].length ; m++){
                if(i + m <= k){
                    answer += board[i][m];
                }
            }
        }
        return answer;
    }
}