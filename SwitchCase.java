import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        switch(age){
            case 18:
                System.out.println("Vote");
                break;
            case 19:
                System.out.println("Job");
                break;
            case 20:
                System.out.println("Marry!!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
    }
}
