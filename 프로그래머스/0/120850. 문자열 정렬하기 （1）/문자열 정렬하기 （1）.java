import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        answer = my_string.chars().filter(Character::isDigit).map(c -> c - '0').sorted().toArray();
        
        return answer;
    }
}