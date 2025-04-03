class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int cnt = 0;
        String match = Integer.toString(k);
        for(int l = i ; l <= j ; l++){
            String str = Integer.toString(l);
            if(str.length() >= 2){
                for(String s : str.split("")){
                    if(match.equals(s)){
                        cnt++;
                    }else{
                        continue;
                    }
                }
            }else{
                if(match.equals(Integer.toString(l))){
                    cnt++;
                }
            }
            answer = cnt;
        }
        return answer;
    }
}