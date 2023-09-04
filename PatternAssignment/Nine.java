import java.util.*;
public class Nine {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n){
			int i=1;
			while(i<=star){
				if(i==1 || i==row){
					System.out.print(row+"\t");
				}else{
					System.out.print(0+"\t");
				}
				i++;
				
			}
			row++;
			star++;
			System.out.println();

		}

    }
}
// 5
// 1
// 2       2
// 3       0       3
// 4       0       0       4
// 5       0       0       0       5