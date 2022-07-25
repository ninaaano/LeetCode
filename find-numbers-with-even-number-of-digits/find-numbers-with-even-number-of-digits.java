class Solution {
    public int findNumbers(int[] nums) {
        // int길이 구하는 방법
        // 1. int > String 으로 변환해서 자릿수 구하가
        // 2. (int)( Math.log10(num)+1 ) 
        int result = 0;
        for(int a : nums){
           if((int)(Math.log10(a)+1)%2==0){
               result ++;
           } 
        }
        return result;
    }
}