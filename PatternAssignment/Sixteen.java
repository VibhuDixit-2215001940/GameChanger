import java.util.Scanner;
public class Sixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=1;
		int star=2*n+1;
		int v=n;
		int t=n;
		while (row<=2*n+1) {
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int i=1;
			while(i<=star) {
				System.out.print(v+"  ");
				if (i<star/2+1) {
					v--;	
				}
				else {
					v++;
				}
				i++;
			}
			row++;
			if(row<=n+1) {
				star-=2;
				space++;
				v=n-row+1;	
				}
			else {
				star+=2;
				space--;
				v=row-n-1;				
			}			
			System.out.println();
        }
	}

}