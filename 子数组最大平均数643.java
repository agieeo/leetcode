//超时代码，123/127
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = -Double.MAX_VALUE;//max为当前最大平均数
        //滑动cy次，一一相加。
        double sum = 0;
        int j = 0;
        double temp = -Double.MAX_VALUE;
        int size = nums.length;
        int cy = size - k + 1;//cy为滑动的次数。
        while(cy > 0){
            for(int i = j; i < k+j; i++ ){
                sum += nums[i];
            }
            temp = (double)sum/(double)k;
            sum = 0;
            max = Math.max(max,temp);
            j++;
            cy--;

        }
        return max;
    }
}

//尝试双指针
//首先计算第一个子数组的和，并更新最大平均数max。
//使用两个指针start和end来遍历数组，每次移动指针时，只需要将起始位置的数值从sum中减去，
//然后将结束位置的数值加入到sum中，计算平均值，并更新最大平均数max即可。
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = -Double.MAX_VALUE;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = Math.max(max, sum / k);
        int start = 0, end = k - 1;
        while (end < nums.length - 1) {
            sum -= nums[start];
            start++;
            end++;
            sum += nums[end];
            max = Math.max(max, sum / k);
        }
        return max;
    }
}