import java.util.*;
public class Main {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int yrs = sc.nextInt();
        System.out.println(solution(yrs));
    }
    public static int solution(int year){
        return year - 543;
    }
}