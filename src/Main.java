import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new MainWindow().getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
//        frame.setSize(800, 700);
        frame.setVisible(true);
    }
}