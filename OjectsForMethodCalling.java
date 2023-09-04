import java.util.Scanner;

public class OjectsForMethodCalling {
        void xyz(int x){
            if(x>18){
                System.out.print("Vote Able");
            }
            else{
                System.out.print("Not able to vote!!");
            }
        }
    public static void main(String[] args) {
        System.out.println("Enter the age: ");
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        OjectsForMethodCalling obj = new OjectsForMethodCalling();
        obj.xyz(age);           //MAKING AN OBJECT FOR CALLING A MATEHOD
    }
}
