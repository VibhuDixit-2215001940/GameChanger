import java.util.Scanner;

public class RaisePower {
    static int raise(int n, int m){
        int ans=0;
        for(int i=1;i<=m;i++){
            ans=ans+n;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = in.nextInt();
        System.out.print("Enter the power: ");
        int m = in.nextInt();
        System.out.println("The no. raise to its power is: "+raise(n,m));
    }
}
