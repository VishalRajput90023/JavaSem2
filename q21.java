class abc implements Runnable
{
Thread x;
public abc(int b)
{
x=new Thread(this);
x.setPriority(b);
}
public void run()
{
for(int a=0;a<3;a++)
System.out.println("INSIDE THE MAXIMUM PRIORITY THREAD");
}
public void start()
{
x.start();
}
}
class abc1 implements Runnable
{
Thread x;
public abc1(int b)
{
x=new Thread(this);
x.setPriority(b);
}
public void run()
{
for(int a=0;a<5;a++)
System.out.println("INSIDE THE MINIMUM PRIORITY THREAD");
}
public void start()
{
x.start();
}
}
public class q21
{
public static void main(String args[])
{
abc one=new abc(Thread.NORM_PRIORITY +2);
abc1 two=new abc1(Thread.NORM_PRIORITY -2);
one.start();
two.start();
try
{
Thread.sleep(10000);
}
catch(InterruptedException e)
{
System.out.println("main thread interrupted");
}
try
{
two.x.join();
one.x.join();
}
catch(InterruptedException e)
{
System.out.println(" interrupted");
}
}
}
