import java.util.Scanner;

public class MaxNo {
    public static void main(String[] args){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first num: ");
        a=s.nextInt();
        System.out.println("Enter second no,: ");
        b=s.nextInt();
        if(a>b){
            System.out.println("The bigger one is: "+a);
        }
        else{
            System.out.println("The bigger one is: "+b);
        }
    }
}
