public class SumOFDiagonal {
    public static void main(String[] args){
        int [][]a={{1,2,3},{1,2,3},{1,2,3}};
        int b=3;        //2d array size;
        int sum=0;
        for(int i=0;i<b;i++){
            for(int j=0;j<b;j++){
                if(i==j){
                    sum=sum+a[i][j];
                }
            }
        }
        System.out.println("The sum of diagonal elements are: "+sum);
    }
}
