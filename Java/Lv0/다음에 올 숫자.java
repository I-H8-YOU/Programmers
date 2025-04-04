class Solution {
    public int solution(int[] common) {
      int answer = 0;

        int diff1 = common[1] - common[0];
        int diff2 = common[2] - common[1];

        if (diff1 == diff2) {
            answer = common[common.length - 1] + diff1;
        } else { 
            int ratio = common[1] / common[0];
            answer = common[common.length - 1] * ratio;
        }
        return answer;
    }
}
