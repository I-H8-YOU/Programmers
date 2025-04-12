class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean isNewWord = true;
        for(char c : s.toCharArray()){
            if(c == ' '){
                sb.append(c);
                isNewWord = true;
            }else{
                if(isNewWord){
                    sb.append(Character.toUpperCase(c));
                    isNewWord = false;
                }else{
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}