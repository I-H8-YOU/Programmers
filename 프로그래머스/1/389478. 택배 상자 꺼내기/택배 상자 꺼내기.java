class Solution {
    public int solution(int n, int w, int num) {
        int answer = 1;
        int height = n / w + 1;
        int targetHeight = 1;
        while(targetHeight * w < num){
            targetHeight++;
        }
        answer = answer + height - targetHeight - 1;
        int lastBlockCnt = n % w;
  
        if (targetHeight == height || (targetHeight == height - 1 && n % w == 0)){
            return 1;
        }
        int pos = w - ((targetHeight * w) - num);
        if((targetHeight % 2 == 0 && height % 2 == 0) ||(targetHeight % 2 != 0 && height % 2 != 0)){
            if(lastBlockCnt >= pos){
                answer++;
            }
        }else{
             if(lastBlockCnt >= (w - pos + 1)) {
                     answer++;
            }       
        }
          
        System.out.println(height+ " "+targetHeight + " " + pos + " "+ lastBlockCnt);
        
        return answer;
    }
}