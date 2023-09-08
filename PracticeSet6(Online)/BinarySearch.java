public class BinarySearch {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,8,9};
        int key=5;
        int l=0;
        int h=a.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==key){
                System.out.println("Element founded!!");
                break;
            }
        }
    }
}
