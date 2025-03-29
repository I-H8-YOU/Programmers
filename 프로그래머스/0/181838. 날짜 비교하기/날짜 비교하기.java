class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
    if (date1[0] < date2[0]) return 1;
    if (date1[0] > date2[0]) return 0;

    // 연도가 같을 경우
    if (date1[1] < date2[1]) return 1;
    if (date1[1] > date2[1]) return 0;

    // 연도, 월이 같을 경우
    if (date1[2] < date2[2]) return 1;

        return answer;
    }
}