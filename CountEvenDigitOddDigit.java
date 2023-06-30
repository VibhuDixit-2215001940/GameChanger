import java.util.Scanner;

public class CountEvenDigitOddDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int a=sc.nextInt();
        int flag=0;
        int count=0;
        while(a>0){
            if(a%2==0){
                flag++;
            }
            else{
                count++;
            }
            a=a/10;
        }
        System.out.println("Total no. of even no. are: "+flag);
        System.out.println("Total no. of odd no. are: "+count);
    }
}
