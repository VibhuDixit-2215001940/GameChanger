import java.util.*;
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);         //Tony

        sb.insert(2,'n');
        System.out.println(sb);         //Tonny

        sb.delete(2,3);
        System.out.println(sb);          //Tony

        sb.append(" kakkar");
        System.out.println(sb);         //Tony kakkar

        sb.setCharAt(0, 'P');
        System.out.println(sb);         //Pony kakkar

        System.out.println(sb.isEmpty());       //false

        // System.out.println(sb.trimToSize());

        System.out.println(sb.length());        //11

        sb.deleteCharAt(0);
        System.out.println(sb);             //ony kakkar

        sb.replace(0,4,"Pappu");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.toString();          //Method overriding
        System.out.println(sb);
    }
}
