//IN THIS QUESTION WE HAVE TO TAKE A LIMIT AND BREAK THE LIMIT ONE BY ONE BY DECREASING ONE.
//IF EVEN NO. COME THEN SUBTRACT IT FROM ANS.
//IF ODD NO. COMES THEN ADD UPS IN ANS..
//RUN TILL LIMIT TENDS TO 0.
//RETURN THE ANS AT LAST.
import java.util.Scanner;

public class SumSeries {
    static int sumseries(int m){
        int ans=0;
        for(int i=1;i<=m;i++){
            if(i%2==0){
                ans=ans-i;
            }
            else{
                ans=ans+i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int n= sc.nextInt();
        System.out.println("The solution after adding and subtr is: "+sumseries(n));
    }
}
