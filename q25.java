import java.awt.*;
import java.applet.*;
/*
<applet code="q25" width=300 height=50>
</applet>
*/
public class q25 extends Applet implements Runnable {
String msg = " SAHIL KAUSHIK ";
Thread t;
public void init() {
setBackground(Color.blue);
setForeground(Color.red);
}
public void start() {
t = new Thread(this);
t.start();
}
public void run() {
char ch;
for( ; ; ) {
try {
repaint();
Thread.sleep(250);
ch = msg.charAt(msg.length()-1);
msg = msg.substring(0, msg.length()-1);
msg = ch+msg;
} 
catch(InterruptedException e) 
{
System.out.println("exception");}
}
}
public void paint(Graphics g) 
{
g.drawString(msg, 80, 30);
}
}