class Solution {
    public String solution(String myString, String pat) {
        int len = pat.length();
        String answer = myString.substring(0, myString.lastIndexOf(pat) + len);
        return answer;
    }
}