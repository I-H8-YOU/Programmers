import java.util.*;
import java.util.stream.Collectors;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] sArr = str.split("");
        List<Integer> nList = Arrays.stream(sArr)
                            .map(Integer::valueOf)
                            .collect(Collectors.toList());
        nList.sort(Comparator.reverseOrder());
        nList.forEach(n -> System.out.print(n));
    }
}