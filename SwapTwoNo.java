public class SwapTwoNo {
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("No. before swap is: "+a+" and "+b);

        //LOGIC 1 - Third variable using
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: "+a+" and "+b);

        //LOGIC 2 - Using + & - without using third variable
        a=a+b;      //10+20=30
        b=a-b;      //30-20=10
        a=a-b;      //30-10=20
        System.out.println("After swapping: "+a+" and "+b);

        //LOGIC 3 - Using * & / without using
        a=a*b;      //10*20=200
        b=a/b;      //200/20=10
        a=a/b;      //200/10=20
        System.out.println("After swapping: "+a+" and "+b);

        //LOGIC 4 - Using bitwise XOR(^)
        a=a^b;      //10^20=30
        b=a^b;      //30^20=10
        a=a^b;      //30^10=20
        System.out.println("After swapping: "+a+" and "+b);

        //LOGIC 5  - Using Single line statement
        b=a+b-(a=b);
        System.out.println("After swapping: "+a+" and "+b);
    }
}
