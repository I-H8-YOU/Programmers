class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        boolean ret = false;
        for(int i = 0 ; i < queries.length ; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for(int l = s ; l <= e ; l++){
                if(l % k == 0){
                    int sum = arr[l] + 1;
                    arr[l] = sum;
                }else continue;
            }
        }
        answer = arr.clone();
        return answer;
    }
}