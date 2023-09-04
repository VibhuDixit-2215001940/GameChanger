import java.util.Scanner;

public class SumOfNNo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int a = sc.nextInt();
        int i=1,sum=0;
        while(i<=a){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of n no. are: "+sum);
    }
}
