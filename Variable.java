public class Variable {
    int a=10;       //INSTANCE VARIABLE
    static double b=20;     //STATIC VARIABLE
    public static void main(String[] args){
        boolean c=true;     //LOCAL VARIABLE
        Variable s=new Variable();
        System.out.println(s.a);    //Instance variable can be print by calling its object
        System.out.println(b);
        System.out.println(c);

        System.out.println(s.a+" "+b+" "+c);
    }
}
