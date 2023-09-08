import java.util.Scanner;
public class PercentageOfStudentsMarks {
    public static void main(String[] args) {
        System.out.print("Enter first subj marks: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.print("Enter second subj marks: ");
        float b = sc.nextFloat();
        System.out.print("Enter third subj marks: ");
        float c = sc.nextFloat();
        float sum = a+b+c;
        int z = (int)sum/30;
        System.out.print("The percentage of student is: ");
        if(z>=90){
            System.out.println("Grade A");
        }
        else if(z<90 && z>=75){
            System.out.println("Grade B");
        }
        else if(z<75 && z>=65){
            System.out.println("Grade C");
        }
        else if(z<65 && z>=50){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Better luck next time!!");
        }
    }
}
