import java.util.Scanner;

public class GreaterNoCheck {
    static void greater(int z){             //GREATER METHOD DEFINING
        int a = 100;
        if(z > a){
            System.out.print("Greater no.!!");
        }
        else{
            System.out.print("Smaller no.!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //SCANNER OBJECT
        System.out.print("Enter a no.: ");      //TAKING INPUT
        int x = sc.nextInt();
        greater(x);         //METHOD CALLING
    }
}
