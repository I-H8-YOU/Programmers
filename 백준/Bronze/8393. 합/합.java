import java.util.*;
import java.util.stream.IntStream;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = IntStream.rangeClosed(1,num).sum();
        System.out.println(sum); 
    }
}