class Solution {
    public int solution(int n) {
        int targetCount = Integer.bitCount(n);
        int num = n + 1;

        while (Integer.bitCount(num) != targetCount) {
            num++;
        }

        return num;
    }
}