import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="q28.class" width=300 height=300>
</applet>
*/
public class q28 extends Applet
implements KeyListener 
{
String msg = "Enter somethingh: ";
public void init() {
addKeyListener(this);
}
public void keyPressed(KeyEvent ke) {
showStatus("Key Down");
int key = ke.getKeyCode();
switch(key) {
case KeyEvent.VK_F1:
msg += "<F1>";
break;
case KeyEvent.VK_F2:
msg += "<F2>";
break;
case KeyEvent.VK_F3:
msg += "<F3>";
break;
case KeyEvent.VK_PAGE_DOWN:
msg += "<PgDn>";
break;
case KeyEvent.VK_PAGE_UP:
msg += "<PgUp>";
break;
case KeyEvent.VK_LEFT:
msg += "<Left Arrow>";
break;
case KeyEvent.VK_RIGHT:
msg += "<Right Arrow>";
break;
}
repaint();
}
public void keyReleased(KeyEvent ke) {
showStatus("Key UP");}

public void keyTyped(KeyEvent ke) {
msg += ke.getKeyChar();
repaint();
}
public void paint(Graphics g) {
g.drawString(msg, 60, 30);
}
}