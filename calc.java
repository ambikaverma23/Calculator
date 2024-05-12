import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
class SwingDemo  extends JFrame implements ActionListener
{
JTextField t;
JLabel l;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bdel,bmul,bdiv,beq,bdec,bclr;
static double a,b,c=0;
static char op=0;

SwingDemo()
{
Font font=new Font("Arial", Font.ITALIC,20);
l=new JLabel("Calculator");
l.setFont(font);
l.setBounds(150,10,150,50);
add(l);

ImageIcon background=new ImageIcon("bckimg11.jpg");
JLabel background1=new JLabel("",background,JLabel.CENTER);
background1.setBounds(0,0,400,600);
add(background1);

t=new JTextField();
t.setBounds(80,50,230,40);
add(t);


b1=new JButton("1");
b1.setBounds(80,100,50,40);
add(b1);
b2=new JButton("2");
b2.setBounds(140,100,50,40);
add(b2);
b3=new JButton("3");
b3.setBounds(200,100,50,40);
add(b3);
badd=new JButton("+");
badd.setBounds(260,100,50,40);
add(badd);


b4=new JButton("4");
b4.setBounds(80,150,50,40);
add(b4);
b5=new JButton("5");
b5.setBounds(140,150,50,40);
add(b5);
b6=new JButton("6");
b6.setBounds(200,150,50,40);
add(b6);
bsub=new JButton("-");
bsub.setBounds(260,150,50,40);
add(bsub);


b7=new JButton("7");
b7.setBounds(80,200,50,40);
add(b7);
b8=new JButton("8");
b8.setBounds(140,200,50,40);
add(b8);
b9=new JButton("9");
b9.setBounds(200,200,50,40);
add(b9);
bmul=new JButton("*");
bmul.setBounds(260,200,50,40);
add(bmul);


bdiv=new JButton("/");
bdiv.setBounds(80,250,50,40);
add(bdiv);
b0=new JButton("0");
b0.setBounds(140,250,50,40);
add(b0);
beq=new JButton("=");
beq.setBounds(200,250,50,40);
add(beq);
bdec=new JButton(".");
bdec.setBounds(260,250,50,40);
add(bdec);


bdel=new JButton("Dlt");
bdel.setBounds(140,300,50,40);
add(bdel);
bclr=new JButton("clr");
bclr.setBounds(200,300,50,40);
add(bclr);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
badd.addActionListener(this);
bsub.addActionListener(this);
bmul.addActionListener(this);
bdiv.addActionListener(this);
beq.addActionListener(this);
bdec.addActionListener(this);
bdel.addActionListener(this);
bclr.addActionListener(this);


setSize(400,600);
setBackground(Color.PINK);
setLayout(null);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
t.setText(t.getText().concat("1"));
}
if(e.getSource()==b2)
{
t.setText(t.getText().concat("2"));
}

if(e.getSource()==b3)
{
t.setText(t.getText().concat("3"));
}

if(e.getSource()==b4)
{
t.setText(t.getText().concat("4"));
}

if(e.getSource()==b5)
{
t.setText(t.getText().concat("5"));
}

if(e.getSource()==b6)
{
t.setText(t.getText().concat("6"));
}

if(e.getSource()==b7)
{
t.setText(t.getText().concat("7"));
}

if(e.getSource()==b8)
{
t.setText(t.getText().concat("8"));
}

if(e.getSource()==b9)
{
t.setText(t.getText().concat("9"));
}

if(e.getSource()==b0)
{
t.setText(t.getText().concat("0"));
}

if(e.getSource()==badd)
{
a=Double.parseDouble(t.getText());
op=1;
t.setText("");
}

if(e.getSource()==bsub)
{
a=Double.parseDouble(t.getText());
op=2;
t.setText("");
}

if(e.getSource()==bmul)
{
a=Double.parseDouble(t.getText());
op=3;
t.setText("");
}

if(e.getSource()==bdiv)
{
a=Double.parseDouble(t.getText());
op=4;
t.setText("");
}

if(e.getSource()==beq)
{
b=Double.parseDouble(t.getText());
switch(op)
{
case 1:
c=a+b;
break;
case 2:
c=a-b;
break;
case 3:
c=a*b;
break;
case 4:
c=a/b;
break;
default:
JOptionPane.showMessageDialog(null,"Enter Correct Input");
}
t.setText(String.valueOf(c));
}

if(e.getSource()==bclr)
{
t.setText("");
}

if(e.getSource()==bdel)
{
String str=t.getText();
t.setText("");
for(int i=0;i<str.length()-1;i++){
t.setText(t.getText()+str.charAt(i));
}
}
}
public static void main(String[] args)
{
new SwingDemo();

}}