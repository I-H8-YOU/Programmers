class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int idx = 0;
        String[] nArr = Integer.toString(num).split("");
        for(int i = 0 ; i < nArr.length ; i++){
            if(nArr[i].equals(Integer.toString(k))){
                answer = i + 1;
                break;
            }else answer = -1;
        }
        return answer;
    }
}
