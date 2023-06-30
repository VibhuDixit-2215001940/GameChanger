import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int num=sc.nextInt();

        //Logic 1 - Using while loop
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reversed no. is: "+rev);

        //LGIC 2 - Using StringBuffer class
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer x=sb.reverse();
        System.out.println("Reversed no. is: "+x);

        //LOGIC 3 - Using StringBuilder class
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder y=sbl.reverse();
        System.out.println("Reversed no. is: "+y);
    }
}
