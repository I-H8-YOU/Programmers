class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String repStr = phone_number.substring(0, phone_number.length() - 4);
        answer = phone_number.replace(repStr,"*".repeat(repStr.length()));
        return answer;
    }
}