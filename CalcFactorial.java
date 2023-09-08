import java.util.Scanner;

public class CalcFactorial {
    static int calcfact(int n){             //PASSING NO. IN INITIALISING METHOD
        if(n == 1 || n == 0){           //IF N IS 1 OR 0 THEN FACTORIAL IS 1
            return 1;
        }
        int fact = calcfact(n-1);           //Decreasing one by one
        int fact_n = n*fact;
        return fact_n;
    }
    public static void main(String[] args) {
        System.out.print("Enter the no.: ");        //TAKING THE NO.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = calcfact(n);              //CALLING METHOD
        System.out.println(ans);
    }
}
