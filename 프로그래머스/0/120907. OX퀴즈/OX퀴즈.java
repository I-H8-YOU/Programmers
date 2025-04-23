class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0 ; i < quiz.length ; i++){
            String[] str = quiz[i].split("\\s+");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[2]);
            int res = Integer.parseInt(str[4]);
            String ops = str[1].trim();
            boolean chk = false;
            switch (ops) {
                case "+" : {
                    chk = (num1 + num2) == res;
                    break;
                }
                case "-" : {
                    chk = (num1 - num2) == res;
                    break;
                }
            }
            answer[i] = chk ? "O" : "X";
        }
        
        return answer;
    }
}