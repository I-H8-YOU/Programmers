class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int cnt = 0;
        answer = new int[arr.length];
        for(int i : arr){
            if(i % 2 == 0 && i >= 50){
                answer[cnt] = i / 2;
                cnt++;
            }else if(i % 2 != 0 && i < 50){
                answer[cnt] = i * 2;
                cnt++;
            }else{
                answer[cnt] = i;
                cnt++;
            }
        }
        return answer;
    }
}
