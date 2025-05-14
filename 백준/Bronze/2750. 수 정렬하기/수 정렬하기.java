import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nList = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            nList.add(sc.nextInt());
        }
        nList.sort(Comparator.naturalOrder());
        for(Integer num : nList){
            System.out.println(num);
        }
    }
}