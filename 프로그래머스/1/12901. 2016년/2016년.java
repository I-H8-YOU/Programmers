import java.time.DayOfWeek;
import java.time.LocalDate; 
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dow = date.getDayOfWeek();
        int num = dow.getValue();
        answer = switch(num){
            case 1 -> "MON";
            case 2 -> "TUE";
            case 3 -> "WED";
            case 4 -> "THU";
            case 5 -> "FRI";
            case 6 -> "SAT";
            case 7 -> "SUN";
            default -> "";
        };
        return answer;
    }
}