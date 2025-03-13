import java.util.Scanner;

public class calculator {
    
    void add(int a,int b){
        int c=a+b;
        System.out.println("the sum is "+c);
    }
    void sub(int a,int b){
        int c=a-b;
        System.out.println("the difference is "+c);
    }
    void product(int a,int b){
        int c=a*b;
        System.out.println("the product is is "+c);
    }
    void divide(int a,int b){
        int c=a/b;
        System.out.println("the division is "+c);
    }

    
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println("Enter your choice");
        System.out.println("1->addition");
        System.out.println("2->subtract");
        System.out.println("3->multiplication");
        System.out.println("4-> divide");

        int n=obj.nextInt();
        calculator obj1=new calculator();
        if(n==1){
            obj1.add(a,b);

        }
        if(n==2){
            obj1.sub(a,b);

        }
        if(n==3){
            obj1.product(a,b);

        }
        if(n==4){
            obj1.divide(a,b);

        }
       
       
    }
    
}
