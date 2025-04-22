class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] subStr = my_string.substring(s,e+1).split("");
        String repStr = my_string.substring(s,e+1);
        for(int i = subStr.length - 1 ; i > -1 ; i--){
            sb.append(subStr[i]);
        }
        answer = my_string.replace(repStr, sb.toString());
        return answer;
    }
}