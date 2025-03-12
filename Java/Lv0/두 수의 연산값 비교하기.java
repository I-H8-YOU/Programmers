class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        String con = a1.concat(b1);
        int sum = Integer.parseInt(con);
        int multiply = 2 * a * b;
        if(sum > multiply){
            answer = sum;
        }else if(sum < multiply){
            answer = multiply;
        }else answer = sum;
        
        return answer;
    }
}
