//找到最高海拔 1732
// 优化前
class Solution {
    public int largestAltitude(int[] gain) {
        List<Integer> height = new ArrayList<>();
        List<Integer> height2 = new ArrayList<>();
        height.add(0);
        int n = gain.length;
        for(int i = 0; i < n; i++){
            height.add(gain[i]);//0,-5,1,5,0,-7
        }
        int sum = 0;
        height2.add(0);
        for(int i = 0; i < n; i++){
            sum = height.get(i+1)+height2.get(i);
            height2.add(sum);//0,-5,-4,
        }
        int max_height = -Integer.MAX_VALUE;
        for(int i = 0; i < n+1; i++){
            max_height = Math.max(max_height, height2.get(i));
        }
        return max_height;
    }
}

//优化后
class Solution {
    public int largestAltitude(int[] gain) {
        int res = 0, sum = 0;
        for(int i = 0; i<gain.length; i++){
            sum += gain[i];
            res = Math.max(res,sum);
        }
        return res;
    }
}