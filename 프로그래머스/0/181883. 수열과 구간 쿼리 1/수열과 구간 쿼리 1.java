class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0 ; i < queries.length ; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            for(int k = s ; k <= e ; k++){
               arr[k]++;
            }
        }
        return arr;
    }
}