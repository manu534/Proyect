import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A_Screen extends JFrame {
    private JPanel marvel_picture;
    private JProgressBar progressBar1;
    private Timer timer;
    private int progressValue = 0;

    public A_Screen() {
        setContentPane(marvel_picture);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(2560,1440);
        setLocationRelativeTo(null);
        int duration = 5000; // 7 segundos en milisegundos
        int steps = 100;
        int stepTime = duration / steps;
        timer = new Timer(stepTime, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar1.setValue(progressValue);
                progressValue++;

                if (progressValue > 100) {
                    timer.stop(); // Detener el temporizador cuando llegue al 100%

                    // Abrir la siguiente ventana y cerrar la actual
                    B_Introduce second = new B_Introduce();
                    second.setVisible(true);
                    dispose();
                }
            }
        });

        timer.start(); // Iniciar el Timer

    }
}
