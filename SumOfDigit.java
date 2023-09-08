import java.util.Scanner;

public class SumOfDigit {
    static int sum(int m){
        int flag=0;
        while(m>0){
            m=m%10;
            flag=flag+m;
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println("Enter a digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum of no. of digit is: "+sum(n));
    }
}
