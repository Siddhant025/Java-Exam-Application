import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class True_False extends JFrame implements ActionListener
{
    JLabel Text;
    JRadioButton jb[]=new JRadioButton[2];
    JButton Next,Submit;
    ButtonGroup bg;
    static int count=0;
    int NOQ=0;

    public void True_False(){
        Text=new JLabel();
        bg=new ButtonGroup();
        for(int i=0;i<2;i++)
        {
            jb[i]=new JRadioButton();
            add(jb[i]);
            bg.add(jb[i]);
        }

        Next=new JButton("Next");
        Submit=new JButton("Submit");
        Next.addActionListener(this);
        Submit.addActionListener(this);

        add(Text);
        add(Next);
        add(Submit);
        Qset();
        Text.setBounds(10,40,550,20);
        jb[0].setBounds(50,80,300,50);
        jb[1].setBounds(50,150,300,50);
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
            if (NOQ==4){
                Submit.setEnabled(true);
                Next.setEnabled(false);
            }
        }
        else if (e.getSource()==Submit){

            QPaper q=new QPaper();
            q.tf.setEnabled(false);
            if (q.cfib==1){
                q.fib.setEnabled(false);
            }
            if (q.cmcq==1){
                q.mcq.setEnabled(false);
            }

        }
    }

    public void Qset(){
        if (NOQ==0){
            Text.setText("Q1:Function malloc returns a pointer of type void * to the memory it allocates. If it is unable to allocate memory, it returns a NULL pointer.");
            jb[0].setText("True");
            jb[1].setText("False");
        }
        else if (NOQ==1){
            Text.setText("Q2:A linked list is a linear collection of self-referential structures, called nodes, connected by pointer links—hence, the term linked list.");
            jb[0].setText("True");
            jb[1].setText("False");
        }
        else if (NOQ==2){
            Text.setText("Q3:Searching is more efficient in Binary Search Trees than in AVL Trees.");
            jb[0].setText("True");
            jb[1].setText("False");
        }
        else if (NOQ==3){
            Text.setText("Q4:In DFS, all the nodes adjacent to the current node are visited.");
            jb[0].setText("True");
            jb[1].setText("False");
        }
        else if (NOQ==4){
            Text.setText("Q5:In Dijkstra's Algorithm a minimal spanning tree can be constructed considering any vertex as the initial vertex.");
            jb[0].setText("True");
            jb[1].setText("False");
        }
    }
    boolean CheckQ(){
        if (NOQ==0 && jb[0].isSelected()){
            return true;
        }
        else if (NOQ==1 && jb[0].isSelected()){
            return true;
        }
        else if (NOQ==2 && jb[1].isSelected()){
            return true;
        }
        else if (NOQ==3 && jb[1].isSelected()){
            return true;
        }
        else if (NOQ==4 && jb[1].isSelected()){
            return true;
        }
        return false;
    }
}
