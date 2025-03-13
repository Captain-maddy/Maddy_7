
import java.util.Scanner;

public class integercheck{
    public  static void main(String[] args){
        System.out.println("enter a number ");
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        if(num>=0)
        {
            System.out.println("he is positive");
        }
        else{
            System.out.println("he is negative");
        }

    }

}
