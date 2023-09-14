class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        x=set()
        y=set()
        l1=len(matrix)
        l2=len(matrix[0])
        for i in range(l1):
            for j in range(l2):
                if(matrix[i][j]==0):
                    x.add(i)
                    y.add(j)
        print(x,y)
        for i in x:
            for j in range(l2):
                matrix[i][j]=0 
        for i in range(l1):
            for j in y:
                matrix[i][j]=0
