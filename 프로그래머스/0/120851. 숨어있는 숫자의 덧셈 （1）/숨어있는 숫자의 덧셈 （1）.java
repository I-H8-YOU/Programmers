import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = my_string.chars().filter(Character::isDigit).map(c -> c - '0').sum();
    
        return answer;
    }
}