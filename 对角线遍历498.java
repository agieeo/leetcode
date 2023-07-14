class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int pos = 0;
        //i<m*n;
        //i是编号，分别对行列编号：0,1,2,3...m+n-2; 0,1,2,3...m+n-2;
        //模拟遍历
        //对角线一共m+n-1条
        //斜上线：从偶数i开始：(i,0)(i<m);(m-1,i-m+1)(i>=m)
        //斜下线：从奇数i开始：(0,i)(i<n);(i-n+1,n-1)(i>=n)
        int m = mat.length; //获取行数
        int n = mat[0].length; //获取列数  
        int[] res = new int[m*n];
        for(int i = 0; i <= m+n-2; i++){
            if(i%2==0){
                int x = i<m ? i : m-1;   //各条件下的初始位置
                int y = i<m ? 0 : i-m+1;
                while(x>=0 && y<n){ //行数x在减少，列数y在增多，所以分别约束
                    res[pos] = mat[x][y];
                    pos++;
                    x--;//对应了箭头往上加一的过程（行数减一遍历）
                    y++;//列数加一遍历
                }

            }
            else{
                int z = i<n ? 0 : i-n+1;
                int w = i<n ? i : n-1;
                while(z<m && w>=0){
                    res[pos] = mat[z][w];
                    pos++;
                    z++;
                    w--;
                }
            }

        }
        return res;
    }

}