public class ExtractEvenOrOddNoFromArray {
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        System.out.print("Even no. are: ");
        for(int i=0;i<5;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
