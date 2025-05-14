import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] sArr = String.valueOf(b).split("");
        System.out.println(a * Integer.parseInt(sArr[2]));
        System.out.println(a * Integer.parseInt(sArr[1]));
        System.out.println(a * Integer.parseInt(sArr[0]));
        System.out.println(a * b);
    }
}