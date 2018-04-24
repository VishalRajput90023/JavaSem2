class overload
{
void a1()
{
System.out.println("no parameters");
}
void a1(int m,int n)
{
System.out.println("m and n= "+m +"  " +n);
}
void a1(double m)
{
System.out.println("m and n= "+m );
}
}
public class q11
{
public static void main(String args[])
{
overload x=new overload();
x.a1();
x.a1(12,14);
x.a1(20);
x.a1(12.23);
}
}
