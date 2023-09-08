import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter the marks of first subject: ");
        int a = sc.nextInt();
        System.out.print("Enter the marks of second subject: ");
        int b = sc.nextInt();
        System.out.print("Enter the marks of third subject: ");
        int c = sc.nextInt();
        float per = (a+b+c)/300;
        if(per<3.00){
            System.out.println("Better luck next time!!");
        }
        else{
            System.out.println("Pass!!");
        }
    }
}
