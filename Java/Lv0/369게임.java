class Solution {
    public int solution(int order) {
        int answer = 0;
        int cnt = 0;
        String[] three = {"3","6","9"};
        String[] num = Integer.toString(order).split("");
        for(int i = 0 ; i < num.length ; i++){
            for(int k = 0 ; k < 3 ; k++){
                if(num[i].equals(three[k])){
                    cnt++;
                    continue;
                }else continue;
            }
        }
        answer = cnt;
        return answer;
    }
}
