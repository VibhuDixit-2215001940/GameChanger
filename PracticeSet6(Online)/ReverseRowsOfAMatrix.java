import java.util.Scanner;

class GFG{
static int M = 3;
static int N = 3;
//FUNCTION
static void reverseArray(int a[][]){                // Function to reverse          // the given 2D arr[][]
	for (int i = 0; i < M; i++) {                   // Traverse each row of arr[][]
		int start = 0;                              // Initialise start and end index
		int end = N - 1;
		while (start < end) {                       // Till start < end, swap the element
			int temp = a[i][start];                 // Swap the element
			a[i][start] = a[i][end];
			a[i][end] = temp;
			start++;                                // Increment start and decrement
			end--;                                  // end for next pair of swapping
		}
	}
	
	for (int i = 0; i < M; i++) {                   // Print the arr[][] after reversing every row
		for (int j = 0; j < N; j++) {
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
	}
}
//DRIVER PROGRAMM
    public static void main(String[] args){
        System.out.print("Enter the size of 2D Array: ");
        Scanner sc=new Scanner(System.in);          //CREATING SCANNER OBJECT
        int n=sc.nextInt();                         //TAKING SIZE OF 2D ARRAY
        int a[][]=new int[n][n];                    //DEFINIG THE ARRAY
        for(int i=0;i<n;i++){                       //TAKING INPUT FROM USER
            for(int j=0;j<n;j++){
                System.out.print("Enter "+i+""+j+" index no.: ");
                a[i][j]=sc.nextInt();
            }
        }
        reverseArray(a);  //Function Call
    }
}
