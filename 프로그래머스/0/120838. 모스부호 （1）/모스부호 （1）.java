import java.util.*;
import static java.util.Map.entry;
class Solution {
    public String solution(String letter) {
         Map<String, String> sMap = Map.ofEntries(
            entry(".-", "a"),
            entry("-...", "b"),
            entry("-.-.", "c"),
            entry("-..", "d"),
            entry(".", "e"),
            entry("..-.", "f"),
            entry("--.", "g"),
            entry("....", "h"),
            entry("..", "i"),
            entry(".---", "j"),
            entry("-.-", "k"),
            entry(".-..", "l"),
            entry("--", "m"),
            entry("-.", "n"),
            entry("---", "o"),
            entry(".--.", "p"),
            entry("--.-", "q"),
            entry(".-.", "r"),
            entry("...", "s"),
            entry("-", "t"),
            entry("..-", "u"),
            entry("...-", "v"),
            entry(".--", "w"),
            entry("-..-", "x"),
            entry("-.--", "y"),
            entry("--..", "z")
        );
        StringBuilder sb = new StringBuilder();
        String[] sArr = letter.split(" ");
        for(int i = 0 ; i < sArr.length ; i++){
            sb.append(sMap.get(sArr[i]));
        }
        return sb.toString();
    }
}