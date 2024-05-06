
class A {

public A(){
this(5);
    System.out.println("Hello From Zero Parametrized parent A");
}


public A(int a )
{
    System.out.println("Hello from Parmetrized  int a");
}
}

class B extends A {

    public B(){
        super();
        System.out.println("Hello From Zero Parametrized parent B");
    }
    
    public B(int b )
    {
      this();
        System.out.println("Hello from Parmetrized  int b");
    }

}


public class SuperFunction {

    public static void main (String a[]){

   B obj2 = new B(5);
   System.out.println(obj2);

    }

}