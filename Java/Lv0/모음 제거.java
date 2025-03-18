class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] vow = {"a","e","i","o","u"};
        
        for(String s : vow){
            my_string = my_string.replace(s,"");
        }
        answer = my_string;
        return answer;
    }
}
