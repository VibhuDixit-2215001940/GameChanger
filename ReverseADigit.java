import java.util.Scanner;

public class ReverseADigit {
    static int rev(int m){
        int flag=0;
        while(m>0){
            flag=flag*10+m%10;
            m=m/10;
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println("Enter a no.: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("The reverse of "+n+" is: "+rev(n));
    }
}
