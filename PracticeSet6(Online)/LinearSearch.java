public class LinearSearch {
    public static void main(String[] args){
        int a[]={10,20,30,40,50,30};
        int n=30;
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                System.out.println("Element founded!!");
                break;
            }
        }
    }
}
