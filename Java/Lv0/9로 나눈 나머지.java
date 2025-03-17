import java.math.BigInteger;
class Solution {
    public int solution(String number) {
        int answer = 0;
        BigInteger bigNum = new BigInteger(number);
        answer = bigNum.mod(BigInteger.valueOf(9)).intValue();
        return answer;
    }
}
