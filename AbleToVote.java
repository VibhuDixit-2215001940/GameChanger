import java.util.Scanner;

public class AbleToVote {
    public static void main(String[] args){
        int a;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your age: ");
        a=s.nextInt();
        if(a>=18){
            System.out.print("Able To Vote!!");
        }
        else{
            System.out.println("Not able to vote!!");
        }
    }
}
