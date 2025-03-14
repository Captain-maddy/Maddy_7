public class multi {
    
    public static void main(String[] args){
        child2 obj=new child2();
        obj.print();


    }
    }

    class parent{
        public void add(){
            System.out.println("Hello world");
        }


    }
    class child extends parent{
        void display(){
            add();
        }
    }

    class child2 extends child{
        void print(){
            display();;
        }
    }


    
