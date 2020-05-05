import java.rmi.activation.ActivationDesc;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainUI {
    public static void main(String args[]) {
        MainFrame frame = new MainFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(200, 200);
            frame.setVisible(true);
            }
}
class MainFrame extends JFrame {
        private JTextField aField;
        private JTextField bField;
        private JLabel resultLabel;
        private JLabel sum;
        private int answer;
        
        public MainFrame(){
            super("UI");
            Container c = getContentPane();
            c.setLayout(new BorderLayout());

            /** (8.1) create components and add to UI **/
            JLabel A = new JLabel("  A : ");
            JLabel B = new JLabel("  B : ");
            resultLabel = new JLabel("  Result :  ");
            sum = new JLabel("ANS");

            aField = new JTextField();
            aField.setBounds(60, 0, 100, 30);

            bField = new JTextField();
            bField.setBounds(60, 30, 100, 30);

            A.setBounds(0,0,30,30);
            B.setBounds(0,30,30,30);
            sum.setBounds(60,63,30,10);
            resultLabel.setBounds(0,90,30,10);
            

            JButton button = new JButton("Calculate");

            
            c.add(A);
            c.add(B);
            c.add(aField);
            c.add(bField);
            c.add(sum);
            c.add(resultLabel);
            c.add(button,BorderLayout.PAGE_END);

            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        int num1 = Integer.parseInt(aField.getText());
                        int num2 = Integer.parseInt(bField.getText());
                        doModulus(num1,num2);
                        //sum.setText(""+num1%num2);
                        
                    }catch (ArithmeticException o) {
                        JOptionPane.showMessageDialog(null,"Error");
                    }
                }
            });
        }


        private void doModulus(int a, int b){
            /** (8.3) processing input and display output accordingly **/
           sum.setText(""+a % b);
        }
}