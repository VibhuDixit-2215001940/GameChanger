import java.util.Scanner;

public class TakingInput{
    public static void main(String[] args){
        int a,b,c;                                  //Declaring the variable
        System.out.print("Enter first no.:  ");
        Scanner s=new Scanner(System.in);           //Definig the scanner class

        a=s.nextInt();                              //Taking int type data
        System.out.print("Enter first no.:  ");
        b=s.nextInt();
        c=a+b;
        System.out.print("The sum of given no. is: "+c);
    }
    
}
