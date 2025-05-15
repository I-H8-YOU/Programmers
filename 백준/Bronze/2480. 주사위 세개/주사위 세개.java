import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> nList = new ArrayList<>();
        nList.add(a);
        nList.add(b);
        nList.add(c);
        if(a == b && b == c){
            System.out.println(10000 + a * 1000);
        }else if(a == b || a == c || b == c){
            nList.sort(Comparator.naturalOrder());
            System.out.println(1000 + nList.get(1) * 100);
        }else{
            System.out.println(nList.stream().mapToInt(n -> n).max().getAsInt() * 100);
        }
    }
}