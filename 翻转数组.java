class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;//第i个数移到指定位置：(i+k)%len。“%“多出来的。
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[(i+k)%len] = nums[i];
        }
        for(int i=0; i<len; i++) {
            nums[i] = arr[i];
        }
    }
}
