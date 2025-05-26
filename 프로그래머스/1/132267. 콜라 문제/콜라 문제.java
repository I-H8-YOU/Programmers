class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        return Math.max(n - b, 0)/(a-b) * b;
    }
}