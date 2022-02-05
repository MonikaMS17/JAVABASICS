public class differenceoftwomatrix  
{  
    public static void main(String[] args) {  
        int rows, cols;  
          
        
          int a[][] = {  
                          {1, 0, 1},  
                          {4, 5, 6},  
                          {1, 2, 3}  
                       };  
            
           
          int b[][] = {  
                          {1, 1, 1},  
                          {2, 3, 1},  
                          {1, 5, 1}  
                     };  
            
          
          rows = a.length;  
        cols = a[0].length;  
          
           
        int difference[][] = new int[rows][cols];  
          
        
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
                difference[i][j] = a[i][j] - b[i][j];  
            }  
        }  
          
        System.out.println("difference of two matrices: ");  
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
               System.out.print(difference[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
}  
