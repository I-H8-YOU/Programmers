class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int len = 0;
        for(int i = 0 ; i < strlist.length; i++){
            len = strlist[i].length();
            answer[i] = len;
        }
        return answer;
    }
}
