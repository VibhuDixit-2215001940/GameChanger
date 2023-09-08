import java.util.*;

public class DuplicateArayElement {
    public static void main(String[] args){
        String a[]={"java","c","c","python"};
        HashSet <String>langs=new HashSet(); 
        // System.out.println(langs.add("Java"));
        // System.out.println(langs.add("Java"));//Return falseas it doesn't allow you to add same thing twice
        // System.out.println(langs.add("Python"));
        boolean flag=false;
        for(String l:a){
            if(langs.add(l)==false){
                System.out.print("Found duplicate element:"+ l);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("No duplicate element found!");
        }
}
}
