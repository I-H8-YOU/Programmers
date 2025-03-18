class Solution {
    public int solution(String my_string) {
        int sum = 0;
        int k = 1;
        String[] calc = my_string.split(" ");
          int answer = Integer.parseInt(calc[0]);
        for(int i = 2; i < calc.length; i += 2){
            String ops = calc[k];
             if(ops.equals("+")){
                 answer += Integer.parseInt(calc[i]);
                 k += 2;
             }else{
                 answer -= Integer.parseInt(calc[i]);
                 k += 2;
             }
        }
    
        return answer;
    }
}
