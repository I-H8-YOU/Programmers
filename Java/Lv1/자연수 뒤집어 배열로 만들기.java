class Solution {
    public int[] solution(long n) {
        int idx = 0;
        String sCon = Long.toString(n);
        String[] sArr = sCon.split("");
        int[] answer = new int[sArr.length];
        for(int i = sArr.length - 1 ; ; i--){
            answer[idx] = Integer.parseInt(sArr[i]);
                idx++;
            if(i == 0){
                break;
            }
        }
        return answer;
    }
}
