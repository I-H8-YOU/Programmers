class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(boolean b : included){
            if(b == true){
                answer += a;
                    a += d;
            }else a += d;
        }
        return answer;
    }
}