import java.util.Scanner;

public class LargestOfThreeNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first no.: ");
        int a=sc.nextInt();
        System.out.print("Enter second no.: ");
        int b=sc.nextInt();
        System.out.print("Enter third no.: ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greatest!!");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greatest!!");
        }
        else{
            System.out.println(c+" is greatest!!");
        }
    }
}
