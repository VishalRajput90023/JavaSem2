import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="q27.class" width=300 height=100>
</applet>
*/
public class q27 extends Applet
implements MouseListener, MouseMotionListener {
String msg = "Handling Mouse Events";
public void init() {
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me) 
{
msg = "Mouse clicked.";
repaint();
}
public void mouseEntered(MouseEvent me) {
msg = "Mouse entered.";
repaint();
}
public void mouseExited(MouseEvent me) {
msg = "Mouse exited.";
repaint();
}
public void mousePressed(MouseEvent me) {
msg = "mouse button pressed";
repaint();
}
public void mouseReleased(MouseEvent me) {
msg = "mouse button released";
repaint();
}
public void mouseDragged(MouseEvent me) {
msg = "mouse is dragged";
showStatus("Dragging mouse  " );
repaint();
}
public void mouseMoved(MouseEvent me){
showStatus("Mouse is moving...");
repaint();
}
public void paint(Graphics g) {
g.drawString(msg,60,30);
}
}