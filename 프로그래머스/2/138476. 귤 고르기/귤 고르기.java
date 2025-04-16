import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> nMap = new HashMap<>();
        Arrays.sort(tangerine);
        int temp = 0;
        int key = 0;
        int cnt = 0;
        for(int i = 0 ; i < tangerine.length ; i++){
            if(i == 0){
                temp = tangerine[i];
                key = tangerine[i];
                cnt++;
                nMap.put(temp, cnt);
            }
            temp = tangerine[i];
            if(temp == key && i != 0){
                cnt++;
                nMap.put(temp,cnt);
            }else{
                cnt = 0;
                key = tangerine[i];
                cnt++;
                nMap.put(key, cnt);
            }
        }
        Iterator<Integer> ir = nMap.keySet().iterator();
        while(ir.hasNext()){
            int key1 = ir.next();
            if(nMap.get(key1) >= k){
                answer = 1;
                break;
            }else{
                List<Integer> nList1 = new ArrayList<>(nMap.values());
                nList1.sort(Collections.reverseOrder());
                int sum = 0;
                for(int i = 0;  i < nList1.size(); i++){
                    sum += nList1.get(i);
                    answer++;
                    if(sum >= k) break;
                }
                break;
            }
        }
        // System.out.println(nMap);
        return answer;
    }
}