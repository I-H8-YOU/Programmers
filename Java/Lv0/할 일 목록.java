class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int cnt = 0;
        int idx = 0;
        for(int i = 0; i < todo_list.length; i++){
            if(finished[i] == false){
                cnt++;
            }else continue;
        }
        answer = new String[cnt];
        for(int k = 0 ; k < todo_list.length ; k++){
            if(finished[k] == false){
                answer[idx] = todo_list[k];
                idx++;
            }else continue;
        }
        return answer;
    }
}
