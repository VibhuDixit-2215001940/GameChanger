import java.util.ArrayList;

public class CreatingArrayWithoutGivingSize {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(12);
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(56);
        System.out.println(list);                      //[12, 23, 34, 45, 56]
        list.set(0,99);
        System.out.println(list);                       //[99, 23, 34, 45, 56]
        System.out.println(list.contains(56));      //true
        System.out.println(list.contains(67));      //false
    }
}
