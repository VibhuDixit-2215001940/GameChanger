import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        int org_n=n;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(org_n==rev){
            System.out.println("PALINDROME NO.!!");
        }
        else{
            System.out.println("NOT A PALINDROME NO.!!");
        }
    }
}
