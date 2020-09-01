import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MCQ extends JFrame implements ActionListener
{
    JLabel l;
    JRadioButton jb[]=new JRadioButton[4];
    JButton Next,Submit;
    ButtonGroup bg;
    static int count=0;
    int NOQ=1;

    public void MCQ(){
        l=new JLabel();
        bg=new ButtonGroup();
        for(int i=0;i<4;i++)
        {
            jb[i]=new JRadioButton();
            add(jb[i]);
            bg.add(jb[i]);
        }

        Next=new JButton("Next");
        Submit=new JButton("Submit");
        Next.addActionListener(this);
        Submit.addActionListener(this);

        add(l);
        add(Next);
        add(Submit);
        Qset();
        l.setBounds(20,40,550,20);
        jb[0].setBounds(50,80,300,20);
        jb[1].setBounds(50,110,300,20);
        jb[2].setBounds(50,140,300,20);
        jb[3].setBounds(50,170,300,20);
        Next.setBounds(100,240,100,30);
        Submit.setBounds(270,240,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        Submit.setEnabled(false);
        setSize(600,600);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==Next){
            if (CheckQ()){
                count++;
            }
            Submit.setEnabled(false);
            NOQ++;
            Qset();
            if (NOQ==5){
                Next.setEnabled(false);
                Submit.setEnabled(true);
            }
        }
        else if (e.getSource()==Submit){
            QPaper q=new QPaper();
            q.mcq.setEnabled(false);
            if (q.ctf==1){
                q.tf.setEnabled(false);
            }
            if (q.cfib==1){
                q.fib.setEnabled(false);
            }
        }

    }
    public void Qset(){
        if (NOQ==1){
            l.setText("Q1:Which of the following is not a type of linked list?");
            jb[0].setText("Circular Linked List");
            jb[1].setText("Doubly Linked List");
            jb[2].setText("Hybrid Linked List");
            jb[3].setText("Singly Linked List");
        }
        else if (NOQ==2){
            l.setText("Q2:Linked list is generally considered as an example of _________ type of memory allocation.");
            jb[0].setText("Static");
            jb[1].setText("Compile Time");
            jb[2].setText("None of These");
            jb[3].setText("Dynamic");
        }
        else if (NOQ==3){
            l.setText("Q3:Each Node contain minimum two fields one field called data field to store data. Another field is of type?");
            jb[0].setText("Pointer to Integer");
            jb[1].setText("Pointer to Class");
            jb[2].setText("Pointer to Node");
            jb[3].setText("Pointer to Character");
        }
        else if (NOQ==4){
            l.setText("Q4:User push 1 element in the stack having already five elements and having stack size as 5 then stack becomes?");
            jb[0].setText("Crash");
            jb[1].setText("User Flow");
            jb[2].setText("Under Flow");
            jb[3].setText("OverFlow");
        }
        else {
            l.setText("Q5:Evaluate Postfix expression from given infix expression."+"A + B * (C + D)/ F + D * E");
            jb[0].setText("AB+CD*F/+D*E");
            jb[1].setText("ABCD+*F/+DE*+");
            jb[2].setText("ABCD+*F/+DE*");
            jb[3].setText("AB+CD*F/DE*");
        }
    }

    boolean CheckQ(){
        if (NOQ==1) {
            return jb[2].isSelected();
        }
        if(NOQ==2) {
            return jb[3].isSelected();
        }
        if (NOQ==3) {
            return jb[2].isSelected();
        }
        if (NOQ==4) {
            return jb[3].isSelected();
        }
        if (NOQ==5) {
            return jb[1].isSelected();
        }
        return false;
    }

}
