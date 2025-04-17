import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        for(int i = 0 ; i < commands.length ; i++){
            int startIdx = commands[i][0];
            int endIdx = commands[i][1];
            int loc = commands[i][2];
            int num = findNum(startIdx, endIdx, loc, array);
            answer[count] = num;
            count++;
            
        }
        return answer;
    }
    private static int findNum(int idx1, int idx2 , int location, int[] commands){
            int[] nArr = new int[idx2 - idx1 + 1];
            int cnt = 0;
            for(int i = idx1 - 1 ; i <= idx2 -1 ; i++){
                nArr[cnt] = commands[i];
                cnt++;
            }
            Arrays.sort(nArr);
            int res = nArr[location-1];
            return res;
        }
}