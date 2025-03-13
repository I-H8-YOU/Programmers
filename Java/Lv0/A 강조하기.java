class Solution {
    public String solution(String myString) {
        String answer = "";
        String conv1 = myString.toLowerCase();
        if(conv1.contains("a")){
            answer = conv1.replace("a","A");
        }
        else answer = conv1;
        return answer;
    }
}
