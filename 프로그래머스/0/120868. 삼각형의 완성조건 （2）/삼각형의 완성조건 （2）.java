import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int n1 = sides[0];
        int n2 = sides[1];
        int min = n2 - n1 + 1;
        int max = n1 + n2 - 1;
        return max - min + 1;
    }
}