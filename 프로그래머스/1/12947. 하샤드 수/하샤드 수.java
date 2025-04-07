class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String[] sArr = String.valueOf(x).split("");
        for(String s : sArr){
            sum += Integer.parseInt(s);
        }
        answer = x % sum == 0 ? true : false;
        return answer;
    }
}