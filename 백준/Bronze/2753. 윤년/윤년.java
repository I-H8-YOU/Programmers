import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(checkYear(year));
    }
    public static int checkYear(int yrs){
        int res = 0;
        if(yrs % 4 == 0){
            if(yrs % 100 != 0 || yrs % 400 == 0){
                res = 1;
            }else{
                res = 0;
            }
        }else{
            res = 0;
        }
        return res;
    }
}