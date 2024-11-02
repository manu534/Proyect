import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B_Introduce extends JFrame {
    private JPanel mainPanel;
    private JPanel SegundoPanel;
    private JPanel RedP;
    private JButton iniciarButton;
    private JPanel P_H_A;
    private JLabel SecondT;

    public B_Introduce() {
        setSize(2560,1440);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                C_Choose second = new C_Choose();
                second.setVisible(true);
                dispose();
            }
        });
    }
}
