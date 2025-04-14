class Solution {
    public String solution(int age) {
         String answer = "";
        char[] cArr = new char[String.valueOf(age).length()];
        int cnt = 0;
        String str = String.valueOf(age);
        for(String i : str.split("")){
            cArr[cnt] = (char)(Integer.parseInt(i) + 65);
            cnt++;
        }
        for(char c : cArr){
            answer += String.valueOf(c);
        }
        
       
        return answer.toLowerCase();
    }
}