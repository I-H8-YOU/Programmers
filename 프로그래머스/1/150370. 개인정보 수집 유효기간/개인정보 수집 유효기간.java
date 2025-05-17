import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] todayArr = today.split("[.]");
        boolean[] boolArr = new boolean[privacies.length];
        Map<String, Integer> policyMap = new HashMap<>();
        for(int i = 0 ; i < terms.length ; i++){
          String[] termParts = terms[i].split(" ");
          policyMap.put(termParts[0], Integer.parseInt(termParts[1]));
        }
        System.out.println(Arrays.toString(todayArr));
        System.out.println(policyMap);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int k = 0 ; k < privacies.length ; k++){
            String[] strArr = privacies[k].split("[. ]+");
            System.out.println(Arrays.toString(strArr));
            int addMonth = policyMap.get(strArr[strArr.length - 1]);
            int month = Integer.parseInt(strArr[1]) + addMonth;
            int year = Integer.parseInt(strArr[0]);
            int day = Integer.parseInt(strArr[2]);
            while (month > 12) {
             year += 1;
             month -= 12;
            }
            int todayYear = Integer.parseInt(todayArr[0]);
            int todayMonth = Integer.parseInt(todayArr[1]);
            int todayDay = Integer.parseInt(todayArr[2]);
            boolean isExpired = false;
            if (year < todayYear) {
                    isExpired = true;
                    count++;
            } else if (year == todayYear && month < todayMonth) {
                    isExpired = true;
                    count++;
            } else if (year == todayYear && month == todayMonth && day <= todayDay) {
                    isExpired = true;
                    count++;
            }
            boolArr[k] = isExpired;
        }
        int[] answer = new int[count];
        int idx = 0;
        for(int l = 0 ; l < boolArr.length ; l++){
            if(boolArr[l] == true){
                answer[idx] = l + 1;
                idx++;
            }else{
                continue;
            }
        }
        return answer;
    }
}