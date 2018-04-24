import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="q30" width=250 height=150>
</applet>
*/
public class q30 extends Applet implements ActionListener {
String msg = "";
Button java, Discrete, maths,English;
public void init() {
java = new Button("java");
Discrete = new Button("Discrete");
maths = new Button("maths");
English = new Button("English");
add(java);
add(Discrete);
add(maths);
add(English);
java.addActionListener(this);
Discrete.addActionListener(this);
maths.addActionListener(this);
English.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
String str = ae.getActionCommand();
if(str.equals("java")) {
msg = "You pressed java.";
}
else if(str.equals("Discrete")) {
msg = "You pressed Discrete.";
}
else if(str.equals("English")) {
msg = "You pressed English.";
}
else {
msg = "You pressed maths.";
}
repaint();
}
public void paint(Graphics g) {
g.drawString(msg, 6, 100);
}
}