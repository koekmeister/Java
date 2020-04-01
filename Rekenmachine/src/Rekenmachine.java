import javax.swing.*;
import java.awt.*;

public class Rekenmachine extends JFrame {
    public static void main(String [] args) {
        JFrame frame = new Rekenmachine();
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("Rekenmachine");
        JPanel paneel = new RekenPaneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);

    }
}
class RekenPaneel extends JPanel {
    private JTextField tekstvak;
    private JButton knop7, knop8, knop9,
                    knop4, knop5, knop6,
                    knop3, knop2, knop1,
                    knopPlus, knopMin, knopKeer, knop0,
                    knopDeel, clear, knopIs;

    public RekenPaneel(){
        // door setLayout te gebruiken heb ik zelf de controle over waar de knoppen en tekstvak komen
        // dit vergt wel meer werk.
        setLayout(null);

        tekstvak = new JTextField(10);

        knop1 = new JButton("1");
        knop2 = new JButton("2");
        knop3 = new JButton("3");
        knop4 = new JButton("4");
        knop5 = new JButton("5");
        knop6 = new JButton("6");
        knop7 = new JButton("7");
        knop8 = new JButton("8");
        knop9 = new JButton("9");
        knop0 = new JButton("0");
        knopPlus = new JButton("+");
        knopKeer = new JButton("X");
        knopMin = new JButton("-");
        knopDeel = new JButton("/");
        knopIs = new JButton("=");
        clear = new JButton("C");

        // knoppen en tekstvak komen hier op de juiste positie.

        tekstvak.setBounds(20, 30, 235, 30);
        knop7.setBounds(20,80, 55, 50);
        knop8.setBounds(80, 80, 55, 50);
        knop9.setBounds( 140, 80, 55, 50);
        knopDeel.setBounds(200, 80, 55, 50);

        knop4.setBounds(20,140, 55, 50);
        knop5.setBounds(80, 140, 55, 50);
        knop6.setBounds( 140, 140, 55, 50);
        knopKeer.setBounds(200, 140, 55, 50);

        knop1.setBounds(20,200, 55, 50);
        knop2.setBounds(80, 200, 55, 50);
        knop3.setBounds( 140, 200, 55, 50);
        knopPlus.setBounds(200, 200, 55, 50);

        knop0.setBounds(20,260, 55, 50);
        clear.setBounds(80, 260, 55, 50);
        knopIs.setBounds( 140, 260, 55, 50);
        knopMin.setBounds(200, 260, 55, 50);



        add(tekstvak);
        add(knop7);
        add(knop8);
        add(knop9);
        add(knopDeel);
        add(knop4);
        add(knop5);
        add(knop6);
        add(knopKeer);
        add(knop1);
        add(knop2);
        add(knop3);
        add(knopPlus);
        add(clear);
        add(knop0);
        add(knopIs);
        add(knopMin);

        //At the underside of the Calculator there wil be a link of the company were  it is made for
    }
}