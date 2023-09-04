import java.util.*;
public class Fourteen {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
		int star=1;
		int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			int val=row;
			while(j<=star) {
	
				System.out.print(val+"\t");
				if(j<row) {
					val++;
				}else {
					val--;
				}
				j++;
				
		}	
		row++;
		star+=2;
		space--;
		System.out.println();
		}


	}

}
// 5
//                                 1
//                         2       3       2
//                 3       4       5       4       3
//         4       5       6       7       6       5       4
// 5       6       7       8       9       8       7       6       5