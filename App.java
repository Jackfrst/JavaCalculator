package com.Guicalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class App extends JFrame
{
    private double temp = 0.0;
    private double temp2 = 0.0;
    private double num = 0.0;
    private double num1 = 0.0;
    private double result = 0.0;
    private char math_op;
    public JPanel Calculator;
    private JTextField NumFil;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnThree;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnPlus;
    private JButton btnMultiply;
    private JButton btnEquals;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnZero;
    private JButton btnPoint;
    private JButton btnClear;
    private JButton lnButton;
    private JButton logButton;
    private JButton a10XButton;
    private JButton sqrt;
    private JButton x3Button;
    private JButton πButton;
    private JButton a1XButton;
    private JButton Fact;
    private JButton x2Button;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton cotButton;
    private JButton secButton;
    private JButton cosecButton1;
    private JButton btn1;
    private JButton xYButton;
    private JButton xButton;
    private JButton exitButton;
    private JButton nπButton;
    private JButton a2XButton;
    private JButton expButton;
    private JButton nPrButton;
    private JButton nCr;

    private void get_op(String btnTxt)
    {
        math_op = btnTxt.charAt(0);
        try {
            temp = temp + Double.parseDouble(NumFil.getText());
        }
        catch (Exception a)
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
        }
        NumFil.setText("");
    }
    public App() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String one = NumFil.getText()+btnOne.getText();
                NumFil.setText(one);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String two = NumFil.getText()+btnTwo.getText();
                NumFil.setText(two);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String three = NumFil.getText()+btnThree.getText();
                NumFil.setText(three);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String four = NumFil.getText()+btnFour.getText();
                NumFil.setText(four);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String five = NumFil.getText()+btnFive.getText();
                NumFil.setText(five);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String six = NumFil.getText()+btnSix.getText();
                NumFil.setText(six);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seven = NumFil.getText()+btnSeven.getText();
                NumFil.setText(seven);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eight = NumFil.getText()+btnEight.getText();
                NumFil.setText(eight);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nine = NumFil.getText()+btnNine.getText();
                NumFil.setText(nine);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String zero = NumFil.getText()+btnZero.getText();
                NumFil.setText(zero);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            temp2 = 0;
            NumFil.setText("");
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(NumFil.getText().equals("")){
                    NumFil.setText("0.");
                }
                else if (NumFil.getText().contains(".")){
                    btnPoint.setEnabled(false);
                }
                else {
                    String point = NumFil.getText() + btnPoint.getText();
                    NumFil.setText(point);
                }
                btnPoint.setEnabled(true);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String btn = btnPlus.getText();
               get_op(btn);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn = btnMinus.getText();
                get_op(btn);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn = btnMultiply.getText();
                get_op(btn);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn = btnDivide.getText();
                get_op(btn);
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn = btn1.getText();
                get_op(btn);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.##");
                switch (math_op)
                {
                    case '+':
                        try {
                            temp2 = Double.parseDouble(df.format(temp + Double.parseDouble(NumFil.getText())));
                        }
                        catch (Exception a)
                        {
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                        }
                        NumFil.setText("");
                        break;
                    case '-':
                        try {
                            temp2 = Double.parseDouble(df.format(temp - Double.parseDouble(NumFil.getText())));
                        }
                        catch (Exception a)
                        {
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                        }
                        NumFil.setText("");
                        break;
                    case '*':
                        try {
                            temp2 = Double.parseDouble(df.format(temp * Double.parseDouble(NumFil.getText())));
                        }
                        catch (Exception a)
                        {
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                        }
                        NumFil.setText("");
                        break;
                    case '/':
                        try {
                            temp2 = Double.parseDouble(df.format(temp / Double.parseDouble(NumFil.getText())));
                        }
                        catch (Exception a)
                        {
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                        }
                        NumFil.setText("");
                        break;
                    case '%':
                        try {
                            temp2 = Double.parseDouble(df.format(temp % Double.parseDouble(NumFil.getText())));
                        }
                        catch (Exception a)
                        {
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                        }
                        NumFil.setText("");
                        break;
                    case 'x':
                        try {
                            temp2 = Double.parseDouble(df.format(Math.pow(temp , Double.parseDouble(NumFil.getText()))));
                        }
                        catch (Exception a)
                        {
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                        }
                        NumFil.setText("");
                        break;
                    case 'n':
                    {
                        try {
                            double n = temp;
                            double r = Double.parseDouble(NumFil.getText());
                            double x1 = 1, x2 = 1, y =  1, z = n - r;
                            for (int i = 1; i <= n; i++){
                                x1 = x1 * i;
                            }
                            for (int i = 1; i <= r; i++){
                                x2 = x2 * i;
                            }
                            for (int i = 1; i <= z; i++){
                                y = y * i;
                            }
                            double b =  x1 / (x2 * y);
                            temp2 = b;
                        }
                        catch (Exception a)
                        {
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                        }
                        NumFil.setText("");}
                        break;
                    case ' ' : {
                        {
                            try {
                                double n = temp;
                                double r = Double.parseDouble(NumFil.getText());
                                double x = 1, y =  1, z = n - r;
                                for (int i = 1; i <= n; i++){
                                    x = x * i;
                                }
                                for (int i = 1; i <= z; i++){
                                    y = y * i;
                                }
                                temp2 = x / y;
                            }
                            catch (Exception a)
                            {
                                Toolkit.getDefaultToolkit().beep();
                                JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                            }
                            NumFil.setText("");}
                        break;
                    }
                }
                NumFil.setText(Double.toString(temp2));
                temp = 0 ;
            }
        });
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = Math.sin(Math.toRadians(num));
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = Math.cos(Math.toRadians(num));
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = Math.tan(Math.toRadians(num));
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        cosecButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = 1.0 / Math.sin(Math.toRadians(num));
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        secButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = 1.0 / Math.cos(Math.toRadians(num));
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num=0;
            }
        });
        cotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = 1.0 / Math.tan(Math.toRadians(num));
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp = 0;
                num = 0;
            }
        });
        a1XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = 1.0 / num;
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp = 0;
                num = 0;
            }
        });
        Fact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                double fact=1;
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                for(int i=1;i<=num;i++){
                    fact=fact*i;
                }
                temp = fact ;
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        x2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    DecimalFormat df = new DecimalFormat("#.####");
                    try
                    {
                        num = Double.parseDouble(NumFil.getText());
                    }
                    catch (Exception a)
                    {
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                    }
                    temp = Math.pow(num,2) ;
                    NumFil.setText("");
                    NumFil.setText(df.format(temp));
                    temp =0;
                    num = 0;
            }
        });
        x3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = Math.pow(num,3) ;
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        xYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn = xYButton.getText();
                get_op(btn);
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = Math.abs(num) ;
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = Math.sqrt(num) ;
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        a10XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = Math.pow(10,num) ;
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = Math.log10(num) ;
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        lnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = Math.log(num);
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        πButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumFil.setText("3.1416");
            }
        });
        nπButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = 3.1416 * num;
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        expButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = Math.exp(num);
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
        nPrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ob = nPrButton.getText();
                get_op(ob);
            }
        });
        nCr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ob = nCr.getText();
                get_op(ob);
            }
        });
        a2XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.####");
                try
                {
                    num = Double.parseDouble(NumFil.getText());
                }
                catch (Exception a)
                {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null," \t\t!! Invalid Input !! ","Error massage ",JOptionPane.ERROR_MESSAGE);
                }
                temp = Math.pow(2,num);
                NumFil.setText("");
                NumFil.setText(df.format(temp));
                temp =0;
                num = 0;
            }
        });
    }
}
