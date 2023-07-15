public class 旋转图像48 {
    class Solution {
        public void rotate(int[][] matrix) {
            int len = matrix.length; //行
            //(2,0),(1,0),(0,0) 原数组坐标
            //(0,0),(0,1),(0,2) 目标数组坐标

            //(2,1),(1,1),(0,1)
            //(1,0),(1,1),(1,2)
            int[][] res = new int[len][len];

            for(int i = 0; i < len; i++){
                for(int j = 0; j < len; j++){
                    res[i][j] = matrix[len-1-j][i];
                }

            }
            System.arraycopy(res,0,matrix,0,len);

        }
    }
}
