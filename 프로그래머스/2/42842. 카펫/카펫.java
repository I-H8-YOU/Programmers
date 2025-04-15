class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
      Ext :  for(int i = 1 ; i < brown ; i++){
            for(int k = 1 ; k < brown ; k++){
                if(i * k == sum && k <= i && (i-2)*(k-2)==yellow){
                    answer[0] = i;
                    answer[1] = k;
                    break Ext;
                }
            }
        }
        return answer;
    }
}