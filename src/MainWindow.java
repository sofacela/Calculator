import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MainWindow {
    private int count;
    private JButton minButton;
    private JButton devButton;
    private JButton powerButton;
    private JButton radiansButton;
    private JButton binaryButton;
    private JButton addButton;
    private JButton multButton;
    private JButton sqrtButton;
    private JButton degreesButton;
    private JButton decimalButton;
    private JPanel panel1;
    private JButton btn7;
    private JButton btn0;
    private JButton btn4;
    private JButton btn9;
    private JButton btn8;
    private JButton btn5;
    private JButton btn6;
    private JButton btnDot;
    private JButton equalButton;
    private JButton clearButton;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton bckButton;
    private JTextField resultField;
    private double operand1;
    private double operand2;
    private char action;
    public MainWindow(){
        Dimension buttonSize = new Dimension(150, 90);

        ArrayList<JButton> buttons = new ArrayList<>();
        buttons.add(btn0);
        buttons.add(btn1);
        buttons.add(btn2);
        buttons.add(btn3);
        buttons.add(btn4);
        buttons.add(btn5);
        buttons.add(btn6);
        buttons.add(btn7);
        buttons.add(btn8);
        buttons.add(btn9);
        buttons.add(btnDot);
        buttons.add(equalButton);
        buttons.add(bckButton);
        buttons.add(clearButton);
        buttons.add(addButton);
        buttons.add(minButton);
        buttons.add(multButton);
        buttons.add(devButton);
        buttons.add(sqrtButton);
        buttons.add(powerButton);
        buttons.add(decimalButton);
        buttons.add(binaryButton);
        buttons.add(degreesButton);
        buttons.add(radiansButton);
        for(JButton button: buttons){
            button.setPreferredSize(buttonSize);
            button.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 20));
        }

        resultField.setPreferredSize(new Dimension(panel1.getWidth(), 80));
        resultField.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 20));

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = resultField.getText() + btn0.getText();
                resultField.setText(number);
            }
        });
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if(count == 1){
                    String number = resultField.getText() + btnDot.getText();
                    resultField.setText(number);
                }
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = resultField.getText() + btn1.getText();
                resultField.setText(number);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = resultField.getText() + btn2.getText();
                resultField.setText(number);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = resultField.getText() + btn3.getText();
                resultField.setText(number);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = resultField.getText() + btn4.getText();
                resultField.setText(number);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = resultField.getText() + btn5.getText();
                resultField.setText(number);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = resultField.getText() + btn6.getText();
                resultField.setText(number);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = resultField.getText() + btn7.getText();
                resultField.setText(number);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = resultField.getText() + btn8.getText();
                resultField.setText(number);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = resultField.getText() + btn9.getText();
                resultField.setText(number);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultField.setText(null);
                count = 0;
            }
        });
        bckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!resultField.getText().isEmpty()){
                    StringBuilder str = new StringBuilder(resultField.getText());
                    if(str.charAt(resultField.getText().length()-1) == '.') count = 0;
                    str.deleteCharAt(resultField.getText().length()-1);
                    resultField.setText(str.toString());
                }
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand1 = Double.parseDouble(resultField.getText());
                action = '+';
                resultField.setText(null);
                count = 0;
            }
        });
        minButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand1 = Double.parseDouble(resultField.getText());
                action = '-';
                resultField.setText(null);
                count = 0;
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand2 = Double.parseDouble(resultField.getText());
                switch(action){
                    case '+':
                        resultField.setText(String.valueOf(operand1 + operand2));
                        break;
                    case '-':
                        resultField.setText(String.valueOf(operand1 - operand2));
                        break;
                    case '*':
                        resultField.setText(String.valueOf(operand1 * operand2));
                        break;
                    case '/':
                        if(operand2 == 0) {JOptionPane.showMessageDialog(panel1, "Devision by zero.", "ERROR", JOptionPane.ERROR_MESSAGE); resultField.setText(""); break;}
                        resultField.setText(String.valueOf(operand1 / operand2));
                        break;
                    case '^':
                        resultField.setText(String.valueOf(Math.pow(operand1, operand2)));
                        break;
                    default:
                        resultField.setText(String.valueOf(operand2));
                }
                if(!resultField.getText().contains(".")) count = 0;
                action = '\u0000';
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand1 = Double.parseDouble(resultField.getText());
                action = '*';
                resultField.setText(null);
                count = 0;
            }
        });
        devButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand1 = Double.parseDouble(resultField.getText());
                action = '/';
                resultField.setText(null);
                count = 0;
            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand1 = Double.parseDouble(resultField.getText());
                resultField.setText(String.valueOf(Math.sqrt(operand1)));
            }
        });

        powerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand1 = Double.parseDouble(resultField.getText());
                action = '^';
                resultField.setText(null);
                count = 0;
            }
        });
        degreesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand1 = Double.parseDouble(resultField.getText());
                resultField.setText(String.valueOf(Math.toDegrees(operand1)));
            }
        });
        radiansButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand1 = Double.parseDouble(resultField.getText());
                resultField.setText(String.valueOf(Math.toRadians(operand1)));
            }
        });
        decimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand1 = Double.parseDouble(resultField.getText());
                resultField.setText(String.valueOf(operand1));
            }
        });
        binaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand1 = Double.parseDouble(resultField.getText());
                resultField.setText(Long.toBinaryString(Double.doubleToLongBits(operand1)));
            }
        });
    }
    public JPanel getPanel1(){
        return panel1;
    }
}
