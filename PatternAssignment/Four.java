import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
       
        int g=-1;
        int r=1;
         int s=size-1;
        
        while(r<=size){
             int ro=r;
            ro=r<=size/2+1?r:size+1-r;
           
            if(r==1||r==size){
                int i=1;
                while(s>=i){
                    System.out.print("  ");
                    i++;
                }
                System.out.print(1+" ");
            }
            else
            {
                int j=1;
                while(s>=j){
                    System.out.print("  ");
                    j++;
                }int k=ro;
                while(k>=1){
                    System.out.print(k+" ");
                    k--;
                }
                int p=1;
                while(g>=p){
                    System.out.print("  ");
                    p++;
                }
                int l=1;
                while(l<=ro){
                    System.out.print(l+" ");
                    l++;
                }
                
            }
            if(r<size/2+1){
                s-=2;
                g+=2;
            }
            else{
                s+=2;
                g-=2;
            }
            r++;
            System.out.println();
        }
    }
}