import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        System.out.println("Before reverse given string is: "+s);
        String rev="";
         
        //LOGIC 1 - Using string concatanation operator
        int len=s.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("String after reversed: "+rev);

        //LOGIC 2 - Uisng array
        String x="";
        char a[]=s.toCharArray();
        int l=a.length;
        for(int i=l-1;i>=0;i--){
            x=x+a[i];
        }
        System.out.println("String after reversed: "+x);

        //LOGIC 3 - Using string buffer class
        StringBuffer sb=new StringBuffer(s);
        System.out.println("String after reversed: "+sb.reverse());
    }
}
