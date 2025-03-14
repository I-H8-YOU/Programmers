class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        int len = arr.length;
        int cnt = 0;
        answer = new int[len];
        if(len % 2 != 0){
            for(int i = 0 ; i < len ; i++){
                    if(i % 2 == 0){
                        answer[cnt] = arr[i] + n;
                        cnt++;
                    }else{
                        answer[cnt] = arr[i];
                        cnt++;
                    }
                }   
           }else{
                for(int k = 0 ; k < len ; k++){
                    if(k % 2 != 0){
                        answer[cnt] = arr[k] + n;
                        cnt++;
                    }else{
                        answer[cnt] = arr[k];
                        cnt++;
                    }
                }
        }
        return answer;
    }
}
