class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String[] sArr = control.split("");
        for(int i = 0 ; i < sArr.length ; i++){
            switch(sArr[i]){
                case "w" -> n += 1;
                    // break;
                case "s" -> n -= 1;
                    // break;
                case "d" -> n += 10;
                    // break;
                case "a" -> n -= 10;
                    // break;
                default -> n += 0;
            }
            answer = n;
        }
        return answer;
    }
}