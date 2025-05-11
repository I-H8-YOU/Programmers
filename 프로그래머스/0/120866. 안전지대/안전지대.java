import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        boolean[][] chk = new boolean[board.length][board[0].length];
        int[] dy = {-1,-1,-1,0,0,1,1,1};
        int[] dx = {-1,0,1,-1,1,-1,0,1};
        List<Integer> nList = new ArrayList<>();
        for(int i = 0 ; i < board.length ; i++){
            for(int k = 0 ; k < board[i].length ; k++){
                nList.add(board[i][k]);
                if(board[i][k] == 1){
                    for(int d = 0 ; d < 8 ; d++){
                        int ny = i + dy[d];
                        int nx = k + dx[d];
                        if(nx >= 0 && ny >= 0 && ny < board.length && nx < board[0].length){
                            chk[ny][nx] = true;
                        }
                    }
                }
            }
        }
        if(nList.indexOf(0) == -1){
            answer = 0;
        }else{
          for(int i = 0 ; i < board.length ; i++){
              for(int k = 0 ; k < board[i].length ; k++){
                  if(chk[i][k] == false && board[i][k] == 0){
                      answer++;
                  }
              }
          }
            
        }
        return answer;
    }
}