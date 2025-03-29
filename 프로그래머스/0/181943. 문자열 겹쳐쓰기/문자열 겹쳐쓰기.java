class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String[] sArr = my_string.split("");
        int idx = 0;
        for(int i = s ; i < s + overwrite_string.length() ; i++){
            sArr[i] = overwrite_string.split("")[idx];
            if(idx < overwrite_string.length())idx++;
        }
        answer = String.join("", sArr);
        return answer;
    }
}