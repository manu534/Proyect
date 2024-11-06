package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class D_List_A extends JFrame {
    private JPanel List;
    private JButton AÑADIRANTIHÉROEButton;
    private JButton ELIMINARANTIHÉROEButton;
    private JButton DEVOLVERSEButton;
    private JButton SALIRButton;
    public D_List_A() {
        setSize(2560, 1440);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        AÑADIRANTIHÉROEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                E_Form_A form=new E_Form_A();
                form.setVisible(true);
                dispose();
            }
        });

    }
}
