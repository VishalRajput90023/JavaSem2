 class abc
{
/*private*/ int x;
public int y;
abc (int a,int b)
 {
   x=a;
   y=b;
 }
void meth1(abc ob)
{ob.x*=2;
ob.y*=2;
}

void meth(int i, int j)
{
i*=2;
j*=2;
}
}
class q12
{
public static void main(String args[])
{
final int a=10;
//a=0;
int b=20;
abc a1=new abc(a,b);
System.out.println("Intial values of a and b: "+a +" "+b);
a1.meth(a,b);
System.out.println("Values of a and b after passing by value: "+a +" "+b);
a1.meth1(a1);
System.out.println("Values of a and b after passing by reference: "+a1.x+" "+a1.y);
}
}

