import java.util.Scanner;

public class input{
    public static void main(String[] args)
    {
        int i=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=obj.nextInt();
        int a[]=new int[n];
        while(i<n){
            System.out.println("enter the number ");
             a[i]=obj.nextInt();
            i++;
        }
        while(i<n){
            System.out.println(a[i]);
            i++;
        }
    
    }
}