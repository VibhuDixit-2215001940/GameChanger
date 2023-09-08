import java.util.Scanner;

public class DotPrpductOTwoMatrices {
    public static void main(String[] args) { 
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
        System.out.print("Enter the size of 2D Array: ");
        int m=sc.nextInt();                         //TAKING SIZE OF 2D ARRAY
        int b[][]=new int[m][m];                    //DEFINIG THE ARRAY
        for(int i=0;i<m;i++){                       //TAKING INPUT FROM USER
            for(int j=0;j<m;j++){
                System.out.print("Enter "+i+""+j+" index no.: ");
                b[i][j]=sc.nextInt();
            }
        } 
        int row1, col1, row2, col2; 
        row1 = a.length;    
        col1 = a[0].length;    
        row2 = b.length;    
        col2 = b[0].length;    
        if(col1 != row2){//For two matrices to be multiplied, number of columns in first matrix must be equal to number of rows
            System.out.println("Matrices cannot be multiplied");    
        }    
        else{      
            int prod[][] = new int[row1][col2];         //new Array For Holding a*b values 
            for(int i = 0; i < row1; i++){              //Performs product of matrices a and b. Store the result in matrix prod   
                for(int j = 0; j < col2; j++){    
                    for(int k = 0; k < row2; k++){    
                       prod[i][j] = prod[i][j] + a[i][k] * b[k][j];     
                    }    
                }    
            }    
            System.out.println("Product of two matrices: ");    
            for(int i = 0; i < row1; i++){          //PPronting Product
                for(int j = 0; j < col2; j++){    
                   System.out.print(prod[i][j] + " ");    
                }    
                System.out.println();    
            }    
        }    
    }    
}

