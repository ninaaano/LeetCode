//내림차순으로 정렬된 정수 배열 숫자가 주어지면 내림차순으로 정렬된 각 숫자의 제곱 배열을 반환합니다.

// 1. 곱한다 2. 정렬한다

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            
            nums[i]=nums[i]*nums[i];
        }
        
        Arrays.sort(nums);
        return nums;
    }
}