import GUI.A_Screen;
import Logic.Heroe;

public class Main{
    public static void main(String[] args) {
        A_Screen a_screen = new A_Screen();
        a_screen.setVisible(true);
        Heroe s = new Heroe("manuel",2,"s","s");
        s.setEdad(2);
    }
}