class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int cnt = 0;
        if(n == 1){
            answer = new int[slicer[1] + 1];
            for(int i = 0 ; i < slicer[1] + 1 ; i++){
                answer[cnt] = num_list[i];
                cnt++;
            }
        }else if(n == 2){
            answer = new int[num_list.length - slicer[0]];
            for(int i = slicer[0] ; i < num_list.length ; i++){
                answer[cnt] = num_list[i];
                cnt++;
            }
        }else if(n == 3){
            answer = new int[slicer[1] - slicer[0] + 1];
            for(int i = slicer[0] ; i < slicer[1] + 1 ;i++){
                answer[cnt] = num_list[i];
                cnt++;
            }
        }else if(n == 4){
            answer = new int[(slicer[1] - slicer[0]) / 2 + 1];
            for(int i = slicer[0] ; i < slicer[1] + 1 ; ){
                answer[cnt] = num_list[i];
                cnt++;
                i += slicer[2];
            }
        }
        return answer;
    }
}