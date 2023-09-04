import java.util.Scanner;

public class EnhanceSwitchCase {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
            //It doesn't need BREAK
        switch(age){
            case 18 -> System.out.println("Vote");
            case 19 -> System.out.println("Job");
             case 20 -> System.out.println("Marry!!");
             default -> System.out.println("Enjoy your life!");      
        }
    }
}