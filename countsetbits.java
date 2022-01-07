class countsetbits {
    
    static int countSetbits(int n)
    {
        
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
 
    
    public static void main(String args[])
    {
        int i = 20;
        System.out.println(countSetbits(i));
    }
}