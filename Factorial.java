//5=5*4*3*2*1.
import java.util.Scanner;

public class Factorial {
    static int fact(int m){
        int ans=1;
        for(int i=1;i<=m;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. to find factorial: ");
        int n = sc.nextInt();
        System.out.println("The factorial of a given no. is: "+fact(n));
    }
}
