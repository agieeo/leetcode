class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length; //C++里用nums.size()
        for (int i=0; i<n-1;++i){
            for(int j=i+1;j<n;++j){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};//C++:return {i,j}
                }
            }
        }
        return new int[]{};
    }
}