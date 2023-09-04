import java.util.ArrayList;
public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 42.3486f;
        System.out.printf("Formatted no. is: %.2f",a);//42.35      //Also round off and print till 2 decimal point
        System.out.println();
        System.out.println(Math.PI);        //3.141592653589793
        System.out.println('a'+'b');        //195    //Only string can concatnate not char thus char's ASCII value is added up.
        System.out.println("a"+"b"); //ab
        System.out.println('a'+3);      //97+3 = 100
        System.out.println((char)('a'+3));      //d
        System.out.println("a"+1);//a1
        System.out.println("kunal"+ new ArrayList<>());//kunal[]
    }
}
