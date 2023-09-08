import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int a=sc.nextInt();
        int org_a=a;
        int count=0;
        while(a>0){
            a=a/10;
            count++;
        }
        System.out.println("The no. of digits in "+org_a+" is "+count);
    }
}
