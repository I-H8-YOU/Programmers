import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int idx = sc.nextInt();
        List<Integer> nList = new ArrayList<>();
        for(int i = 0 ; i < cnt ; i++){
            int num = sc.nextInt();
            nList.add(num);
        }
        nList.sort(Comparator.naturalOrder());
        System.out.println(nList.get(nList.size() - idx));
    }
}