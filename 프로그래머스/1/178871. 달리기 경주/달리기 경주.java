import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        Map<String, Integer> sMap = new HashMap<>();
        int cnt = 1;
        for(int i = 0 ; i < players.length ; i++){
            sMap.put(players[i], i);
        }
        for(int i = 0 ; i < callings.length ; i++){
            String str = callings[i];
            int idx = sMap.get(str);
            String prev = players[idx - 1];
            players[idx] = players[idx - 1];
            players[idx - 1] = str;
            sMap.put(str, idx - 1);
            sMap.put(prev, idx);
        }
        return answer;
    }
}