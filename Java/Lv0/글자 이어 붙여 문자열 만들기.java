class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] sArray = new String[index_list.length];
        sArray = my_string.split("");
        for(int n : index_list){
            answer += sArray[n];
        }
        return answer;
    }
}
