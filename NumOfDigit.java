import java.util.Scanner;

public class NumOfDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();
        int NumOfdigit = 0;
        while(n>0){
            n = n /10;
            NumOfdigit++;
        }
        System.out.println("The no. of digit in given no. is: "+NumOfdigit);
    }
}