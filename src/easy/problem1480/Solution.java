package easy.problem1480;
// 1480. running sum of 1d array

class Solution {
    public int[] runningSum(int[] nums) {
        int i = 1;
        while (i<nums.length){
            nums[i]+=nums[i-1];
            i++;
        }
        return nums;
    }

}