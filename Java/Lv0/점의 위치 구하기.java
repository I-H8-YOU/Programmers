class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0] > 0 ? 1 : 0;
        int y = dot[1] > 0 ? 1 : 0;
        if(x == 1 && y == 1){
            return answer = 1;
        }else if(x == 0 && y == 1){
            return answer = 2;
        }else if(x == 0 && y == 0){
            return answer = 3;
        }else if(x == 1 && y == 0){
            return answer = 4;
        }
        return 0;
    }
}
