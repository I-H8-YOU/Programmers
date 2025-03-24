class Solution {
    public int[] solution(int[] arr) {   
        List<Integer> nList = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            for(int k = 0 ; k < arr[i] ; k++){
                nList.add(arr[i]);
            }
        }
        int[] answer = nList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
