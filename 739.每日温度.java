class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++){
            int temperature = temperatures[i];
            while(!stack.isEmpty() && temperature > temperatures[stack.peek()]){
                int preIndex = stack.pop();
                ans[preIndex] = i - preIndex;//对应的等待天数 i - prevIndex
            }
            stack.push(i);//i是下标
        }
        return ans;
    }
}
