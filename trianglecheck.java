public class trianglecheck{
     public static void main(String[] args) {
        int a=14;
        int b=29;
        int c=169;
        if(a<=0||b<=0||c<=0||(a+b+c)!=180){
            System.out.print("not valid");
        } 
        else
        {
            System.out.print("valid");
        }
    }
}