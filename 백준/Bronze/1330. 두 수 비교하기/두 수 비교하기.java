import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a,b));
    }
    public static String solution(int...nums){
        String answer = "";
        if(nums[0] > nums[1]){
            answer = ">";
        }else if(nums[0] < nums[1]){
            answer = "<";
        }else{
            answer = "==";
        }
        return answer;
    }
}