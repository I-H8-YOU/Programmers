class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int len = my_string.length() - is_suffix.length();
        int len1 = my_string.length();
        if(my_string.contains(is_suffix)){
            if(my_string.substring(len, len1).equals(is_suffix)){
                answer = 1;
            }else answer = 0;
        }else answer = 0;
        return answer;
    }
}