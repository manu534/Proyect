import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class D_List_H extends JFrame {
    private JButton AÑADIRANTIHÉROEButton;
    private JButton ELIMINARHÉROEButton;
    private JButton DEVOLVERSEButton;
    private JButton SALIRButton;
    private JPanel List;

    public D_List_H() {
        setSize(2560, 1440);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(List);
        DEVOLVERSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                C_Choose back=new C_Choose();
                back.setVisible(true);
                dispose();
            }
        });
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
