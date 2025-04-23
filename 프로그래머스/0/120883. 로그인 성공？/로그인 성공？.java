class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pw = id_pw[1];
        for(int i = 0 ; i < db.length ; i++){
            for(int k = 0 ; k < db[i].length ; k++){
                if(k == 0 && id.equals(db[i][k])){
                    if(pw.equals(db[i][k+1])){
                        return "login";
                    }else{
                        return "wrong pw";
                    }
                }else{
                    continue;
                }
            }
        }
        
        return "fail";
    }
}