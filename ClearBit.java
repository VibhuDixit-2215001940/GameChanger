//CLEAR THE 3ND BIT POSITION = 1 OF A NO. N=0101.
//1.Bit mAsk: 1<<pos
//2.Operation: AND WITH NOT

import java.util.*;
public class ClearBit {
    public static void main(String[] args) {
        int n = 5/*0101 */, pos = 2, bitmask = 1<<pos, notBitMask = ~(bitmask);

        int newNo = notBitMask & n;
        System.out.println(newNo);
    }
}
//1
