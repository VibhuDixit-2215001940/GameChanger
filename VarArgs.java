public class VarArgs {
    static int sum(int ...arr){
        int res=0;
        for(int a : arr){
            res+=a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 2 & 3 is: "+sum(2,3));
        System.out.println("The sum of 2 & 3,5 is: "+sum(2,3,5));
        System.out.println("The sum of 2 & 3,6,7,8 is: "+sum(2,3,6,7,8));
        System.out.println("The sum of 2,9,8,7 & 3,10 is: "+sum(2,3,9,8,7,10));
    }
}
