import java.util.Scanner;

public class Recursion_Factorial {
    //factorial(0) = 1
    //factorial(1) = 1
    //factorial(n) = n*n-1*n-2*......*1
    //factorial(5) = 5*4*3*2*1
    static int factorial(int n){        //METHOD DEFINING
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);        //METHOD RECURSION
        }
    }

    public static void main(String[] args) {        //MAIN METHOD
        System.out.println("Enter a no. to find factorial: ");      //TAKING INPUT
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The factorial of given no. is: "+factorial(a));     //METHOD CALLING
    }
}
