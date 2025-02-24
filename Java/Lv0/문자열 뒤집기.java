class Solution {
    public String solution(String my_string) {
        String[] strList = my_string.split("");
        int len = strList.length;
        boolean chk = (len >= 1 && len <= 1000);
        String answer = "";
        if(chk){
            for(int i = 0; i < strList.length; i++){
                answer += strList[len - i - 1];
            }
        }       
        return answer;
    }
}
