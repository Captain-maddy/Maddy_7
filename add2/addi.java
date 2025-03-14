import java.util.*;

public class addi{
    public static void main(String[] args){
    
        addi obj1=new addi();
        obj1.add1(10,20);
        obj1.add1(10,20,30);
    }



public void add1(int a,int b,int c){
    int d=a+b+c;
    System.out.println(d);
}
public void add1(int a,int b){
    int d=a+b;
    System.out.println(d);
}
}