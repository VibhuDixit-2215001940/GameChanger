public class RemoveWhiteSpacesInAString {
    public static void main(String[] args){
        String str="My name is Vibhu Dixit";
        str=str.replaceAll("\\s","");
        System.out.println("String after removing spaces is: "+str);
    }
}
