import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FIB extends JFrame implements ActionListener
{
    JLabel Text;
    JTextField Answer;
    JButton Next,Submit;
    int NOQ=0;
    static int count=0;

    public void FIB(){
        Text=new JLabel();
        Answer=new JTextField();
        Next=new JButton("Next");
        Submit=new JButton("Submit");
        Next.addActionListener(this);
        Submit.addActionListener(this);

        add(Text);
        add(Answer);
        add(Next);
        add(Submit);
        Qset();
        Text.setBounds(10,40,550,20);
        Answer.setBounds(100,150,300,50);
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
            q.fib.setEnabled(false);
            if (q.ctf==1){
                q.tf.setEnabled(false);
            }
            if (q.cmcq==1){
                q.mcq.setEnabled(false);
            }

        }
    }
    public void Qset(){
        if (NOQ==0){
            Text.setText("Q1:The _________ of a vertex is the number of edges this vertex has that are connected to other vertices.");
        }
        if (NOQ==1){
            Answer.setText("");
            Text.setText("Q2:In a heap data structure, the largest element is placed in________");
        }
        if (NOQ==2){
            Answer.setText("");
            Text.setText("Q3:_________sort  method is optimal because the sorted array is developed without using any extra storage space.");
        }
        if (NOQ==3){
            Answer.setText("");
            Text.setText("Q4:If a node is a terminal node, then its left child and right child field are filled with__________");
        }
        if (NOQ==4){
            Answer.setText("");
            Text.setText("Q5:__________  refers to the amount of storage the algorithm consumes");
        }

    }
    boolean CheckQ(){
        String Ans=Answer.getText();
        if (NOQ==0 && Ans.equals("outdegree")){
            return true;
        }
        if (NOQ==1 && Ans.equals("root")){
            return true;
        }
        if (NOQ==2 && Ans.equals("insertion")){
            return true;
        }
        if (NOQ==3 && Ans.equals("null")){
            return true;
        }
        if (NOQ==4 && Ans.equals("space complexity")){
            return true;
        }
        return false;
    }
}
