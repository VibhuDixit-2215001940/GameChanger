public class RotateMatrixElement {
    public static void main(String args[]){  
        int a[][]= {{1,2,3},{4,5,6},{7,8,9}};               //matrix to rotate  
        System.out.println("Original Matrix: ");  
        for(int i=0;i<3;i++){                               //loop for rows 
            for(int j=0;j<3;j++){                           //loop for columns
                System.out.print(" "+a[i][j]+" ");         //prints the elements of the original matrix    
            }  
            System.out.println();  
        }  
        System.out.println("Rotate Matrix by 90 Degrees Clockwise: ");  
        for(int i=0;i<3;i++){                               //prints the elements of the rotated matrix 
            for(int j=2;j>=0;j--){   
                System.out.print(""+a[j][i]+" ");  
            }  
            System.out.println();  
        }  
    }  
}   

