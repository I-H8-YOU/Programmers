class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        String abStr = aStr.concat(bStr);
        String baStr = bStr.concat(aStr);
        int n1 = Integer.parseInt(abStr);
        int n2 = Integer.parseInt(baStr);
        answer = n1 >= n2 ? n1 : n2;
        return answer;
    }
}
