import javax.swing.*;  
public class checkbox  
{  
     checkbox(){  
        JFrame f= new JFrame("CheckBox Example");  
        JCheckBox checkBox1 = new JCheckBox("py",true);  
        checkBox1.setBounds(100,100, 50,50);  
        JCheckBox checkBox2 = new JCheckBox("java");  
        checkBox2.setBounds(100,150, 50,50);  
        f.add(checkBox1);  
        f.add(checkBox2);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
public static void main(String args[])  
    {  
    new checkbox();  
    }
}  
