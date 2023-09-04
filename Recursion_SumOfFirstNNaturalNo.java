import java.util.Scanner;

public class Recursion_SumOfFirstNNaturalNo {
    public static void sumNumb(int i, int n, int sum){
        if(i==n){
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        sumNumb(i+1, n , sum);
    }
    public static void main(String[] args) {
        // System.out.println("Enter the limit to find sum: ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        sumNumb(1, 5, 0);
    }
}
