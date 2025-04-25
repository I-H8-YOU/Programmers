class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int k = 0 ; k < arr[i].length ; k++){
                if(arr[i][k] == arr[k][i]){
                    answer = 1;
                    continue;
                }else{
                    return 0;
                }
            }
        }
        return answer;
    }
}