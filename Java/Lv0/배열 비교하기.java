class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        if(arr1.length != arr2.length){
            answer = arr1.length > arr2.length ? 1 : -1;
            if(arr1.length == arr2.length){
                return 0;
            }
        }else{
            for(int i : arr1){
                sum1 += i;
            }
            for(int k : arr2){
                sum2 += k;
            }
            answer = sum1 > sum2 ? 1 : -1;
            if(sum1 == sum2){
                return 0;
            }
        }
        return answer;
    }
}
