
import java.util.Scanner;

public class add{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=a+b;
        System.out.println("the sum is "+c);
    }
}