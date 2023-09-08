import java.util.Scanner;

public class DetectDoubleTripleSpaces {
    static int hasSpace(String str){
        int count=0;
	    for(int i=0;i<str.length();i++){
	       if(str.charAt(0)==' ' || str.charAt(i)==' '&&str.charAt(i+1)!=' '){
                 count++;
	       }	
        }
		return count;
	}
    public static void main(String arg[]){
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the string: ");
	    String s = sc.nextLine(); 
        int z = hasSpace(s);
	    System.out.print("Given string containes"+z+" spaces.");
	}            
}