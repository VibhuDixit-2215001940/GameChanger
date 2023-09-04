public class StringOperations {
    public static void main(String[] args){
        String str="Vibhu";         //String Variable
        int n=str.length();         //Finding Length Of A String
        System.out.println(n);          //5
        System.out.println(str.toUpperCase());      //VIBHU
        System.out.println(str.toLowerCase());      //vibhu

        String str1=new String("Vibhu");        //String Object
        //CHECKING VALUE IN VARIABLE & OBJECT
        if(str==str1){
            System.out.println("EQUAL!!");
        }
        else{
            System.out.println("NOT EQUAL!!");
        }
        //OUTPUT:- Not Equal(As per relational opertaor) kyunki == check karta hai reference ko naaki content ko
        if(str.equals(str1)){
            System.out.println("EQUAL!!");
        }
        else{
            System.out.println("NOT EQUAL!!");
        }
        //OUTPUT:- Equal(As per equal method) kyunki .equal check karta hai content ko naaki reference ko
    }
}