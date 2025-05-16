import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();     
        int min = sc.nextInt();    
        int totalMin = hr * 60 + min - 45;  
        if (totalMin < 0) {
            totalMin += 24 * 60;
        }
        hr = totalMin / 60;        
        min = totalMin % 60;       
        sc.close();
        System.out.println(hr + " " + min);
    }
}