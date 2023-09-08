import java.util.Scanner;
public class SumThreeNo{
    public static void main(String[] args) {
        System.out.println("Enter the first no.: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second no.: ");
        int b = sc.nextInt();
        System.out.println("Enter third no.: ");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("The sum of "+a+" , "+b+" and "+c+" is: "+sum);
    }
}