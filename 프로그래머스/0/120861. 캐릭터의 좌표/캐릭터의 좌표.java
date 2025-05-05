class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int yLimit = board[1] / 2;
        int xLimit = board[0] / 2;
        for(int i = 0 ; i < keyinput.length ; i++){
            if(keyinput[i].equals("up")){
                if(answer[1] < yLimit){
                    answer[1]++;
                }else{
                    answer[1] = yLimit;
                }
            }else if(keyinput[i].equals("down")){
                if(answer[1] > yLimit * -1){
                    answer[1]--;
                }else{
                    answer[1] = yLimit * -1;
                }
            }else if(keyinput[i].equals("left")){
                if(answer[0] > xLimit * -1){
                    answer[0]--;
                }else{
                    answer[0] = xLimit * -1;
                }
            }else if(keyinput[i].equals("right")){
                if(answer[0] < xLimit){
                    answer[0]++;
                }else{
                    answer[0] = xLimit;
                }
            }
        }
        return answer;
    }
}