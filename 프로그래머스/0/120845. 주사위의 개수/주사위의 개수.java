class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int height = box[2] / n;
        int width1 = box[0] / n;
        int width2 = box[1] / n;
        answer = height * width1 * width2;
        return answer;
    }
}