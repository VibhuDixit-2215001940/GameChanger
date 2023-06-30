import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        int n;
        System.out.print("Enter a no.: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.println("The table of "+n+" are given:- ");
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
