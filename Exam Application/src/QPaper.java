import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QPaper extends JFrame implements ActionListener
{
    MCQ m=new MCQ();
    True_False t=new True_False();
    FIB f=new FIB();
    JButton mcq;
    JButton tf;
    JButton fib;
    JButton Result;
    private JLabel l1,l2,l3;
    private JPanel P1;
    private GridBagConstraints cst;
    int cmcq=0,ctf=0,cfib=0;

    public QPaper(){
        P1=new JPanel(new GridBagLayout());
        cst=new GridBagConstraints();
        l1=new JLabel("MCQ(One/More Correct)");
        l2=new JLabel("True/False");
        l3=new JLabel("Fill In The Blanks");

        l1.setForeground(Color.RED);
        l2.setForeground(Color.RED);
        l3.setForeground(Color.RED);

        mcq=new JButton("START MCQ");
        tf=new JButton("START TRUE/FALSE");
        fib=new JButton("START FIB");
        Result=new JButton("RESULT");
        mcq.setForeground(Color.blue);
        tf.setForeground(Color.blue);
        fib.setForeground(Color.blue);
        Result.setForeground(Color.blue);

        cst.fill=GridBagConstraints.HORIZONTAL;
        cst.gridx=0;
        cst.gridy=1;
        cst.insets=new Insets(10,10,10,10);
        P1.add(l1,cst);

        cst.fill=GridBagConstraints.HORIZONTAL;
        cst.gridx=1;
        cst.gridy=1;
        cst.insets=new Insets(50,10,50,10);
        P1.add(mcq,cst);

        cst.fill=GridBagConstraints.HORIZONTAL;
        cst.gridx=0;
        cst.gridy=3;
        cst.insets=new Insets(10,10,10,10);
        P1.add(l2,cst);

        cst.fill=GridBagConstraints.HORIZONTAL;
        cst.gridx=1;
        cst.gridy=3;
        cst.insets=new Insets(50,10,50,10);
        P1.add(tf,cst);

        cst.fill=GridBagConstraints.HORIZONTAL;
        cst.gridx=0;
        cst.gridy=5;
        cst.insets=new Insets(10,10,10,10);
        P1.add(l3,cst);

        cst.fill=GridBagConstraints.HORIZONTAL;
        cst.gridx=1;
        cst.gridy=5;
        cst.insets=new Insets(50,10,50,10);
        P1.add(fib,cst);

        cst.fill=GridBagConstraints.HORIZONTAL;
        cst.gridx=5;
        cst.gridy=9;
        cst.insets=new Insets(50,10,50,10);
        P1.add(Result,cst);

        mcq.addActionListener(this);
        tf.addActionListener(this);
        fib.addActionListener(this);
        Result.addActionListener(this);
        add(P1);
        setResizable(false);
        setTitle("SET-A");
        setSize(600, 600);
        setVisible(true);
        setBackground(Color.green);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==mcq){
            setVisible(false);
            cmcq++;
            m.MCQ();
        }
        if (e.getSource()==tf){
            setVisible(false);
            ctf++;
            t.True_False();
        }
        if(e.getSource()==fib) {
            setVisible(false);
            cfib++;
            f.FIB();
        }
        if (e.getSource()==Result){
            int total=MCQ.count+True_False.count+FIB.count;
            JOptionPane.showMessageDialog(this,"Your Total Score is: "+total+" Marks.","ATTENTION",JOptionPane.INFORMATION_MESSAGE);
            new Exam_GUI();
        }
    }

}
