import java.util.Scanner;

public class add {
    public static void main(String[] args)
    {
       
        int k=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=obj.nextInt();
        for(int i=1;i<n;i++){
            if(i%2==0){
                k=0;
            }
        }
        if(k==1){
            System.out.println("This is prime");

        }
        else{
            System.out.println("this is not a prime number");
        }
}
}