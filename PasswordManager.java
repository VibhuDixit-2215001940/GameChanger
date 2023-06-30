import java.util.Scanner;

public class PasswordManager{
    public static void main(String[] args){
        int a;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter password: ");
        a=s.nextInt();
        if(a==2510){
            System.out.print("Unlocked!!");
        }
        else{
            System.out.print("Wrong Password!!");
        }
    }
}
