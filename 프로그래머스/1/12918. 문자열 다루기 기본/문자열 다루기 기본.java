class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        char[] cArr = s.toCharArray();
        if(s.length() == 4 || s.length() == 6){
        for(char c : cArr){
            if(Character.isDigit(c)){
                cnt++;
            }else{
                // answer = false;
                return false;
            }
        }
     }else{
            return false;
        }
        if(cnt == s.length()) answer = true;
        return answer;
    }
}