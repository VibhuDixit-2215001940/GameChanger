import java.util.Scanner;

public class AddTwoBinaryNo{
 public static void main(String[] args)
 {
  long x, y;
  int i = 0, remainder = 0;
  int[] sum = new int[20];        //Defining An Array 
  Scanner in = new Scanner(System.in);

  System.out.print("Input first binary number: ");
  x = in.nextLong();
  System.out.print("Input second binary number: ");
  y = in.nextLong();

  while (x != 0 || y != 0){
   sum[i++] = (int)((x % 10 + y % 10 + remainder) % 2);       //Typecasting formula to int
   remainder = (int)((x % 10 + y % 10 + remainder) / 2);
   x = x / 10;
   y = y / 10;
  }
  if (remainder != 0){
   sum[i++] = remainder;
  }
  --i;
  System.out.print("Sum of two binary numbers: ");
  while (i >= 0){
   System.out.print(sum[i--]);
  } 
 }
}