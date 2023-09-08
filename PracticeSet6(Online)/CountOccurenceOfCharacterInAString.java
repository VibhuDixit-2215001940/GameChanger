public class CountOccurenceOfCharacterInAString {
    public static void main(String[] args){
        String s="Java Programming";
        int totalcount=s.length();
        int totalcount_afterRemove=s.replace("a","").length();
        int count=totalcount - totalcount_afterRemove;
        System.out.println("No. of occurence is: "+count);
    }
}
