class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String s1 = "";
        String s2 = "";
        String[] sArr = my_string.split("");
        s1 = sArr[num1];
        s2 = sArr[num2];
        sArr[num1] = s2;
        sArr[num2] = s1;
        for(String s : sArr){
            answer += s;
        }
        return answer;
    }
}
