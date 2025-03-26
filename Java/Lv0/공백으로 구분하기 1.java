class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        if(my_string.contains(" ")){
            answer = my_string.split(" ");
        }else{
            answer = new String[1];
            answer[0] = my_string;
        }
        return answer;
    }
}
