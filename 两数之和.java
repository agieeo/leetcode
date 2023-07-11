class Solution {//暴力解法
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
class Solution2 { //hash解法
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();//map为空
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);//这个将nums[i],放入map的不能放前面
        }
        return new int[]{};
    }
}