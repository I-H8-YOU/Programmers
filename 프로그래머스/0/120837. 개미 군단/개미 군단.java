class Solution {
    public int solution(int hp) {
        int answer = 0;
        int gen = 5, sol = 3, work = 1;
        int cnt = 0;
            while(true){
                cnt++;
                hp -= gen;
                if(hp < 0){
                    hp += gen;
                    cnt--;
                    break;
                }
            }
            while(true){
                cnt++;
                hp -= sol;
                if(hp < 0){
                    hp += sol;
                    cnt--;
                    break;
                }
            }
            while(true){
                cnt++;
                hp -= work;
                if(hp < 0){
                    hp += gen;
                    cnt--;
                    break;
                }
            }
         answer = cnt;
        return answer;
            }
       
        

    
}