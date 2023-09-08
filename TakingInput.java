import java.util.*;

public class TakingInput {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println(a); 
        // boolean b=sc.hasNextInt();          //For checking user inputted right datatype or not
        // System.out.println(b);
        // String str = sc.next();             //Only Take single word
        String str = sc.nextLine();             //For taking whole line
        System.out.println(str);
    }
}
