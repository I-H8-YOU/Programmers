class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] cArr = my_string.toCharArray();
        for(char c : cArr){
            if(Character.isUpperCase(c)){
                int idx = c - 65;
                answer[idx]++;
            }else{
                int idx = c - 97 + 26;
                answer[idx]++;
            }
        }
        return answer;
    }
}