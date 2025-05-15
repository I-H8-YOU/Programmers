import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int cook = sc.nextInt();
        sc.close();
        int totalMinutes = hour * 60 + min + cook; 
        int newHour = (totalMinutes / 60) % 24;     
        int newMin = totalMinutes % 60;             
       System.out.println(newHour + " " + newMin);
    }
}