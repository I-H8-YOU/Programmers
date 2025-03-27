class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.contains(is_prefix)){
            if(my_string.split("")[0].equals(is_prefix.split("")[0]) && my_string.split("")[1].equals(is_prefix.split("")[1]) ){
                answer = 1;
            }else answer = 0;
        }else answer = 0;
        return answer;
    }
}