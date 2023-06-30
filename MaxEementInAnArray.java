public class MaxEementInAnArray {
    public static void main(String[] args){
        int a[]={5,8,3,9,4,0};
        int max=0;
        for(int i=0;i<=5;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum no. is : "+max);
    }
}
