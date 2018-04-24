import java.util.*;
public class q7
     {
      public static void main(String ar[])
         {
             Scanner ab=new Scanner(System.in);
             int a,c=0;
             a=Integer.parseInt(ar[0]);
             int sum[]=new int[a];
             System.out.println("Enter the elements");
             for(int i=0;i<a;i++) 
                  {
                     sum[i]=ab.nextInt();
                  }
             for(int i=0;i<a;i++)
                  c+=sum[i];
             System.out.println("Sum of the elements "+c);
         }
     }     