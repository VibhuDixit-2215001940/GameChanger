///USING SAME FUNCTIONAL NAME BY CHANGING ONLY ARGUMENTS 

public class MethodsOverLoading {
    static void logic(){
        System.out.println("Hello!!");
    }
    static void logic(int a){                   //THE PASSING VALUE CONTAINER IS PARAMETERS
        System.out.println("Hello!!"+a);
    }
    public static void main(String[] args) {
        int x = 10;     
        logic();
        logic(x);       //ARGUMENTS ARE ACTUAL VALUE I.E 10
    }
}
