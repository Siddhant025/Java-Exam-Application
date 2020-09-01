import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam_GUI extends JFrame implements ActionListener
{
    public static void main(String[] args) {
         new Exam_GUI();
    }
    JLabel l1, l2, l3, l4;
    JButton btn1;
    JTextField t1;
    JPasswordField p1;

    public Exam_GUI(){
        l1 = new JLabel("JEE ADVANCED", SwingConstants.CENTER);
        l1.setFont(new Font("Serif", Font.BOLD, 40));
        l1.setForeground(Color.blue);

        l2 = new JLabel("Username:");
        l3 = new JLabel("Application Number:");
        btn1 = new JButton("Submit");
        t1 = new JTextField();
        p1 = new JPasswordField();

        l4=new JLabel("Login Portal For Student",SwingConstants.CENTER);
        l4.setFont(new Font("Serif",Font.BOLD,30));
        l4.setForeground(Color.RED);
        l4.setBounds(100,400,400,40);

        l1.setBounds(100, 30, 400, 150);
        l2.setBounds(80, 170, 200, 30);
        l3.setBounds(80, 210, 200, 30);
        t1.setBounds(200, 170, 200, 30);
        p1.setBounds(200, 210, 200, 30);
        btn1.setBounds(200, 300,100,30);

        btn1.addActionListener(this);

        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(p1);
        add(btn1);
        add(l4);

        setResizable(false);
        setTitle("Login Page");
        setLayout(null);
        setSize(600, 600);
        setVisible(true);
        setBackground(Color.green);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String U=t1.getText();
        String P=p1.getText();
        if (U.equals("Sid_209") && P.equals("9999")){
            setVisible(false);
            new QPaper();
        }
        else {
            JOptionPane.showMessageDialog(this, "Login For Different Username Not Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
            p1.setText("");
            t1.setText("");
        }
    }
}

