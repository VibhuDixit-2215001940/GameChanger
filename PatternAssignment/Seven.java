import java.util.*;
public class Seven {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int row=1;
		int star=1;
		int star2=1;
		int space=n+1;
		while(row<=n){
			int i=1;
			while(i<=star){
				System.out.print(i+"\t");
				i++;	
			}
			int j=1;
			while(j<=space){
				System.out.print("\t");
				j++;
			}
			int k=row;
			while(k+row>star2){
				if(row==n){
					System.out.print(k-1+"\t");

				}else{
					System.out.print(k+"\t");
				}
				
				k--;
			}
			row++;
			star++;
			if(row==n){
				star2=star2+2;
			}else{
				star2++;
			}
			space=space-2;
			System.out.println();

		}

    }
}
// 5
// 1                                                       1
// 1       2                                       2       1
// 1       2       3                       3       2       1
// 1       2       3       4       4       3       2       1
// 1       2       3       4       5       4       3       2       1