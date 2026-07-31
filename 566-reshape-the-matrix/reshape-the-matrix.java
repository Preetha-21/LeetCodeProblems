class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int a[][]=new int[r][c];
        int m=0;
        int n=0;
        if((r*c)!=(mat[0].length)*(mat.length))
        {
            return mat;
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=mat[m][n];
               if (n == mat[0].length - 1) {
                  m++;
                   n=0;
                 
              } 
                           
               else {
                 n++;
               }
            }
        }
        return a;
    }
}