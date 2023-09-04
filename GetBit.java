//GET THE 3RD BIT (POSITION = 2) OF A NO. n=0101.

//For GetBit
//1.Have to find bit mask: 1<<position
//2.Operation: ( 1<<position) & n
public class GetBit {
    public static void main(String args[]){
        int n =5/*0101 */ , pos =3 , bitmask = 1<<pos;

        if((bitmask & n) == 0){         
            System.out.println("Bit was zero!!");
        }
        else{
            System.out.println("Bit was one!!");
        }
    }
}
//Bit was zero!!