public class DuplicatesInArray {
    public static void main(String[] args){
        String a[]={"java","c","c","python"};
        //APPROACH 1 
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            for(int j=1+i;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Found duplicate elemenet: "+a[i]);
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("Element not found!!");
        }
    }
}
