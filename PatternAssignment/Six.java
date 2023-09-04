import java.util.*;
public class Six {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		int space=0;
		
		while(row<=2*n-1){
			int i=1;
			while(i<=star){
				System.out.print("*");
				i++;
			}
			int j=2;
			while(j<=space){
				System.out.print(" ");
				j++;
			}
			int k=1;
			if(row==1||row==2*n-1){
				k=2;
			}
			
			while(k<=star){
				System.out.print("*");
				k++;
			}
			row++;
			if(row<=n ){
				star--;
				space=space+2;
		
			}else{
				star++;
				space=space-2;
			}
			System.out.println();
			

		}
    }
}
// 5
// *********
// **** ****
// ***   ***
// **     **
// *       *
// **     **
// ***   ***
// **** ****
// *********