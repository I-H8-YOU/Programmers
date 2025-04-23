class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] sArr = polynomial.split(" ");
        int cnt = 0;
        int sum = 0;
        for(int i = 0 ; i < sArr.length ; i++){
            if(sArr[i].contains("x")){
                // char cChk = sArr[i].charAt(0);
                if(sArr[i].equals("x")){
                    cnt++;   
                }else{
                String strNum = sArr[i].substring(0, sArr[i].length() - 1);
                int rNum = Integer.parseInt(strNum);
                    cnt += rNum;
                }
            }else if((!sArr[i].equals("+")) && (!sArr[i].contains("x"))){
                sum += Integer.parseInt(sArr[i]);
            }else{
                continue;
            }
        }
        if(cnt == 0){
            answer = String.valueOf(sum);
        }else if(sum == 0){
            answer = cnt > 1 ? cnt + "x" : "x";
        }else{
            if(cnt < 2){
                answer = "x" + " + " + sum;
            }else{
                answer = cnt + "x" + " + " + sum;
            }
            
        }
                
        
        return answer;
    }
}