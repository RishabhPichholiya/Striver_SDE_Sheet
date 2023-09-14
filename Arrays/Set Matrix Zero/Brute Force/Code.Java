class Solution {
    public void setZeroes(int[][] matrix) {
        int n,m;
        n=matrix.length; 
        m=matrix[0].length; 
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                if(matrix[i][j]==0){
                a[i]=1;
                b[j]=1;}
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==1 || b[j]==1){
                    matrix[i][j]=0;
                }
            }

        }
    }
}
