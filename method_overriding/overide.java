public class overide{
    public static void main(String[] args) {
        child obj=new child();
        obj.in1();
        parent obj1=new parent();
        obj1.in1();
    }
}



class parent{
    void in1(){
        System.out.println("PARENT CLASS");
    }

}
class child extends parent{
    void in1(){
        System.out.println("Child class");
    }
}