//SET THE 2ND BIT POSITION = 1 OF A NO. N=0101.
//1.Bit mAsk: 1<<pos
//2.Operation: OR
import java.util.*;
public class SetBit {
    public static void main(String[] args) {
        int n = 5/*0101 */, pos = 2, bitmask = 1<<pos;

        int newNo = bitmask | n;
        System.out.println(newNo);
    }
}
