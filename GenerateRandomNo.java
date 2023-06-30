import java.util.Random;

public class GenerateRandomNo {
    public static void main(String[] args){
        //APPROACH 1 - Random built-in class
        Random rand=new Random();       //Creating an object for random class
        int a=rand.nextInt(10);//It will generate random no. till 10-1=9 only
        // double a=rand.nextDouble();
        System.out.println("Random no. are: "+a);

        //APPROACH 2 - Math class using (only decimal no. can be generate bydefault)
        System.out.println(Math.random());

        //APPROACH 3 - Apache commas-lang API
        // String b=RandomStringUtils.randomNumeric(5);
        // System.out.println(b);
    }
}
