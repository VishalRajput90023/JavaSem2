import java.util.Scanner;


class Distance
    
{
        
int feet;
        
double inches;
        
public Distance(int ft,float in)
        
{
            
feet=ft;
            
inches=in;
        
}
  
public Distance(Distance ob)
{
feet=ob.feet;
inches=ob.inches;
}      
public void convert(double metre)
        
{
            
feet=(int)(metre*3.28084);
            
double temp=metre*3.28084;
            
temp=temp-feet;
            
inches=temp*12;
        
}
        
public void display()
        
{
            
System.out.println("THE DISTANCE IS "+feet+"ft "+inches+"in");
        
}
    
}

public class q10

{
    
public static void main(String args[])
    
{
        
Distance d1 = new Distance(0,0);
        
System.out.print("ENTER THE DISTANCE ( in metre ) : ");
  
System.out.println();     
Scanner input=new Scanner(System.in);
        
double metre=input.nextDouble();
        
d1.convert(metre);
        
System.out.println();
System.out.println();      

d1.display();

System.out.println();        
Distance d2=new Distance(d1);
        
d2.display();

 System.out.println();       
Distance d3=d1;;
        
d3.display();
System.out.println();
    
}

}

