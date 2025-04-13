class Solution {
    public long solution(long n) {
        long answer = 0;
        double calc = Math.sqrt(n);
        String str = String.valueOf(calc);
        String[] sArr = str.split("\\.");
        if(sArr[1].length() == 1){
            int x = Integer.parseInt(str.replace(".0",""));
            answer = (long)Math.pow(x+1 , 2);
        }else{
            answer = -1;
        }
        return answer;
    }
}