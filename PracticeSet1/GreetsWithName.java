import java.util.Scanner;
public class GreetsWithName {
    public static void main(String[] args) {
        System.out.print("Enter you name: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();     //Taking Onlly Name Not Surname
        System.out.print("Hello!! "+str);
    }   
}
