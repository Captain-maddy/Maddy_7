import java.util.Scanner;

class cal{
     public int add(int a,int b){
        int c=a+b;
        return c;
        
        
    }
    public int sub(int a,int b){
        int c=a-b;
        return c;

    }
    public int product(int a,int b){
        int c=a*b;
        return c;
    }
    public void divide(int a,int b){
        float c=a/b;
        System.out.println(c);
        
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        cal obj1=new cal();
        System.out.println("ENTER TWO NUMBERS");
        int a=obj.nextInt();
        int b=obj.nextInt();

        System.out.println("Calculator  ");
        System.out.println("Enter choice for operation");
        System.out.println("1-> ADDITION");
        System.out.println("2-> SUBTRACTION");
        System.out.println("3-> MULTIPLICATION");
        System.out.println("4-> DIVIDE");
        System.out.println("5-> Quit");
        
        
         int n=obj.nextInt();
            switch(n) {
               
            case 1:
                obj1.add(a,b);
                break;
            case 2:
                obj1.sub(a,b);
                break;
            case 3:
                obj1.product(a,b);
                break;
            case 4:
                obj1.divide(a, b);
                break;
        
        
            }
        


        
    }

    }