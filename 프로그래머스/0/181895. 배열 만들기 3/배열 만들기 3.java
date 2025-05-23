class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2];
        int cnt = 0;
        for(int i = intervals[0][0] ; i <= intervals[0][1] ; i++){
            answer[cnt] = arr[i];
            cnt++;
        }
        for(int k = intervals[1][0] ; k <= intervals[1][1] ; k++){
            answer[cnt] = arr[k];
            cnt++;
        }
        return answer;
    }
}