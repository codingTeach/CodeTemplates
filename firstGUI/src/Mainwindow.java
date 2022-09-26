import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainwindow extends  JFrame{
    private JPanel panel1;
    private JTextArea introduceTuNombreTextArea;
    private JTextField textField1;
    private JButton presionameButton;

    public Mainwindow() {
        presionameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(presionameButton,textField1.getText());

            }
        });
    }

    public static void main(String [] args)
    {
       Mainwindow nueva = new Mainwindow();
       nueva.setContentPane(nueva.panel1);
       nueva.setSize(540,400);
       nueva.setTitle("This is a new application");
       nueva.setVisible(true);
    }
}
