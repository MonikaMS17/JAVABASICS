public class averageofnum {
    public static void main(String[] args) {
        int count=0;
        int num=13;
        int sum=0;
        while(num<=15){
            count=count+1;
            sum+=num;
            num=num+1;
        }
        System.out.println(sum/count);
    }
}
