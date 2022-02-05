class Lower_triangular
{
    int N = 4;
 
    
    boolean isLowerTriangularMatrix(int mat[][])
    {
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (mat[i][j] != 0)
                    return false;
 
        return true;
    }
 
    
    public static void main(String args[])
    {
        Lower_triangular ob = new Lower_triangular();
        int mat[][] = { { 1, 0, 0, 0 },
                        { 1, 4, 0, 0 },
                        { 4, 6, 2, 0 },
                        { 0, 4, 7, 6 } };
                         
        
        if (ob.isLowerTriangularMatrix(mat))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
