class sparsematrixornot {
     
    static int MAX = 100;
      
    static boolean isSparse(int array[][], int m, int n)
    {
        int counter = 0;
      
        
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (array[i][j] == 0)
                    ++counter;
      
        return (counter > ((m * n) / 2));
    }
      
   
    public static void main(String args[])
    {
        int array[][] = { { 1, 0, 3 },
                            { 0, 0, 4 },
                            { 6, 0, 0 } };
      
        int m = 3,
            n = 3;
        if (isSparse(array, m, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}