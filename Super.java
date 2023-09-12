class A
{
    public A()
    {
        super();
        System.out.println("in A");
    }

    public A(int n)
    {
        super();
        System.out.println("in parameterised A");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }

    public B(int n)
    {
        this();
        System.out.println("in the parameterised B");
    }
}

public class Super {
    public static void main(String[] args){

        B obj = new B(5);
    }
}
