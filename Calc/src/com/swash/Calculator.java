package com.swash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    double number, answer;
    int calculation;
    JFrame window;
    JButton btnNum0;
    JButton btnNum1;
    JButton btnNum2;
    JButton btnNum3;
    JButton btnNum4;
    JButton btnNum5;
    JButton btnNum6;
    JButton btnNum7;
    JButton btnNum8;
    JButton btnNum9;
    JButton btnDecimalPt;
    JButton btnEqualTo;
    JButton btnSum;
    JButton btnSub;
    JButton btnMul;
    JButton btnDiv;
    JButton btnPer;
    JButton btnDel;
    JButton btnClear;
    JButton btnScientific;
    JTextField txtPanel ;
    JLabel signPanel;
    JLabel lblName;
    Calculator(){
        window=new JFrame("Calculator");
        txtPanel=new JTextField();
        signPanel=new JLabel();
        btnClear=new JButton("C");
        btnDel=new JButton("\uF0E7");
        btnNum7=new JButton("7");
        btnNum8=new JButton("8");
        btnNum9=new JButton("9");
        btnNum4=new JButton("4");
        btnNum5=new JButton("5");
        btnNum6=new JButton("6");
        btnNum1=new JButton("1");
        btnNum2=new JButton("2");
        btnNum3=new JButton("3");
        btnScientific=new JButton();
        btnNum0=new JButton("0");
        btnDecimalPt=new JButton(".");
        btnPer=new JButton("%");
        btnDiv=new JButton("/");
        btnSub=new JButton("-");
        btnMul=new JButton("*");
        btnSum=new JButton("+");
        btnEqualTo=new JButton("=");
        lblName=new JLabel("Arithmetic Calculator");

        txtPanel.setEditable(false);
        txtPanel.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPanel.setFont(new Font(" ",Font.BOLD, 25));
        signPanel.setHorizontalAlignment(SwingConstants.RIGHT);
        lblName.setHorizontalAlignment(SwingConstants.CENTER);
        lblName.setFont(new Font(" ",Font.ITALIC, 25));
        btnNum0.setFont(new Font(" ",Font.BOLD, 25));
        btnNum1.setFont(new Font(" ",Font.BOLD, 25));
        btnNum2.setFont(new Font(" ",Font.BOLD, 25));
        btnNum3.setFont(new Font(" ",Font.BOLD, 25));
        btnNum4.setFont(new Font(" ",Font.BOLD, 25));
        btnNum5.setFont(new Font(" ",Font.BOLD, 25));
        btnNum6.setFont(new Font(" ",Font.BOLD, 25));
        btnNum7.setFont(new Font(" ",Font.BOLD, 25));
        btnNum8.setFont(new Font(" ",Font.BOLD, 25));
        btnNum9.setFont(new Font(" ",Font.BOLD, 25));
        btnDecimalPt.setFont(new Font(" ",Font.BOLD, 25));
        btnEqualTo.setFont(new Font(" ",Font.BOLD, 25));
        btnSum.setFont(new Font(" ",Font.BOLD, 25));
        btnSub.setFont(new Font(" ",Font.BOLD, 25));
        btnMul.setFont(new Font(" ",Font.BOLD, 25));
        btnDiv.setFont(new Font(" ",Font.BOLD, 25));
        btnPer.setFont(new Font(" ",Font.BOLD, 25));
        btnDel.setFont(new Font(" ",Font.BOLD, 25));
        btnClear.setFont(new Font(" ",Font.BOLD, 25));
        btnScientific.setFont(new Font(" ",Font.BOLD, 25));

        txtPanel.setBounds(10,10,480,160);
        signPanel.setBounds(450,170,40,20);
        lblName.setBounds(120,210,260,100);
        btnClear.setBounds(10,210,100,100);
        btnDel.setBounds(390,210,100,100);
        btnNum7.setBounds(10,320,85,85);
        btnNum8.setBounds(105,320,85,85);
        btnNum9.setBounds(200,320,85,85);
        btnNum4.setBounds(10,415,85,85);
        btnNum5.setBounds(105,415,85,85);
        btnNum6.setBounds(200,415,85,85);
        btnNum1.setBounds(10,510,85,85);
        btnNum2.setBounds(105,510,85,85);
        btnNum3.setBounds(200,510,85,85);
        btnScientific.setBounds(10,605,85,85);
        btnNum0.setBounds(105,605,85,85);
        btnDecimalPt.setBounds(200,605,85,85);
        btnPer.setBounds(305,320,83,85);
        btnDiv.setBounds(405,320,85,85);
        btnSub.setBounds(305,415,85,85);
        btnMul.setBounds(405,415,85,85);
        btnSum.setBounds(305,510,83,180);
        btnEqualTo.setBounds(405,510,85,180);

        btnNum1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().contains("=")){
                    txtPanel.setText("");
                    signPanel.setText("");
                }
                txtPanel.setText(txtPanel.getText() +"1");
            }
        });
        btnNum2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().contains("=")){
                    txtPanel.setText("");
                    signPanel.setText("");
                }
                txtPanel.setText(txtPanel.getText() +"2");
            }
        });
        btnNum3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().contains("=")){
                    txtPanel.setText("");
                    signPanel.setText("");
                }
                txtPanel.setText(txtPanel.getText() +"3");
            }
        });
        btnNum4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().contains("=")){
                    txtPanel.setText("");
                    signPanel.setText("");
                }
                txtPanel.setText(txtPanel.getText() +"4");
            }
        });
        btnNum5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().contains("=")){
                    txtPanel.setText("");
                    signPanel.setText("");
                }
                txtPanel.setText(txtPanel.getText() +"5");
            }
        });
        btnNum6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().contains("=")){
                    txtPanel.setText("");
                    signPanel.setText("");
                }
                txtPanel.setText(txtPanel.getText() +"6");
            }
        });
        btnNum7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().contains("=")){
                    txtPanel.setText("");
                    signPanel.setText("");
                }
                txtPanel.setText(txtPanel.getText() +"7");
            }
        });
        btnNum8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().contains("=")){
                    txtPanel.setText("");
                    signPanel.setText("");
                }
                txtPanel.setText(txtPanel.getText() +"8");
            }
        });
        btnNum9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().contains("=")){
                    txtPanel.setText("");
                    signPanel.setText("");
                }
                txtPanel.setText(txtPanel.getText() +"9");
            }
        });
        btnNum0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().contains("=")){
                    txtPanel.setText("");
                    signPanel.setText("");
                }
                txtPanel.setText(txtPanel.getText() +"0");
            }
        });

        btnDecimalPt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().contains("=")){
                    txtPanel.setText("");
                    signPanel.setText("");
                }
                if(txtPanel.getText().contains(".")){
                    txtPanel.setText(txtPanel.getText());
                }else {
                    txtPanel.setText(txtPanel.getText() + ".");
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPanel.setText("");
                signPanel.setText("");
            }
        });

        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().length()>0&&txtPanel.getText().length()==0) {
                    txtPanel.setText(Double.toString(number));
                    signPanel.setText("");
                }else if(signPanel.getText().contains("=")) {
                    signPanel.setText("");
                }else{
                    int length = txtPanel.getText().length();
                    int number = txtPanel.getText().length() - 1;
                    String store;
                    if (length > 0) {
                        StringBuilder back = new StringBuilder(txtPanel.getText());
                        back.deleteCharAt(number);
                        store = back.toString();
                        txtPanel.setText(store);
                    }
                }
            }
        });

        btnPer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().length()==0) {
                    calculation = 5;
                    number = Double.parseDouble(txtPanel.getText());
                    signPanel.setText(txtPanel.getText() + "%");
                    arithmeticOperation();
                    signPanel.setText("");
                }else{
                    if (txtPanel.getText().length() > 0) {
                        arithmeticOperation();
                        txtPanel.setText("");
                    }
                    calculation=5;
                    signPanel.setText(Double.toString(number)+"%");
                    arithmeticOperation();
                    signPanel.setText("");
                }
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().length()==0) {
                    calculation = 4;
                    number = Double.parseDouble(txtPanel.getText());
                    signPanel.setText(txtPanel.getText() + "/");
                    txtPanel.setText("");
                } else if (signPanel.getText().contains("=")) {
                    calculation = 4;
                    signPanel.setText(Double.toString(number) + "/");
                    txtPanel.setText("");
                } else {
                    if (txtPanel.getText().length() > 0) {
                        arithmeticOperation();
                        txtPanel.setText("");
                    }
                    calculation = 4;
                    signPanel.setText(Double.toString(number) + "/");
                }

            }
        });

        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().length()==0) {
                    calculation = 3;
                    number = Double.parseDouble(txtPanel.getText());
                    signPanel.setText(txtPanel.getText() + "*");
                    txtPanel.setText("");
                } else if (signPanel.getText().contains("=")) {
                    calculation =3;
                    signPanel.setText(Double.toString(number) + "*");
                    txtPanel.setText("");
                }else{
                    if(txtPanel.getText().length()>0){
                        arithmeticOperation();
                        txtPanel.setText("");
                    }
                    calculation=3;
                    signPanel.setText(Double.toString(number)+"*");
                }
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().length()==0) {
                    calculation = 2;
                    number = Double.parseDouble(txtPanel.getText());
                    signPanel.setText(txtPanel.getText() + "-");
                    txtPanel.setText("");
               } else if (signPanel.getText().contains("=")) {
                    calculation = 2;
                    signPanel.setText(Double.toString(number) + "-");
                    txtPanel.setText("");
                }else{
                    if(txtPanel.getText().length()>0){
                        arithmeticOperation();
                        txtPanel.setText("");
                    }
                    calculation=2;
                signPanel.setText(Double.toString(number)+"-");
            }
            }
        });

        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().length()==0) {
                    calculation = 1;
                    number = Double.parseDouble(txtPanel.getText());
                    signPanel.setText(txtPanel.getText() + "+");
                    txtPanel.setText("");
                } else if (signPanel.getText().contains("=")) {
                    calculation = 1;
                    signPanel.setText(Double.toString(number) + "+");
                    txtPanel.setText("");
                }else{
                    if(txtPanel.getText().length()>0){
                        arithmeticOperation();
                        txtPanel.setText("");
                    }
                    calculation=1;
                    signPanel.setText(Double.toString(number)+"+");
                }
            }
        });

        btnEqualTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(signPanel.getText().length()>0&&!signPanel.getText().contains("=")) {
                    arithmeticOperation();
//                    signPanel.setText("=");
                }else{
                    number=Double.parseDouble(txtPanel.getText());
                }
                signPanel.setText("=");
//                number=Double.parseDouble(txtPanel.getText());
            }
        });

        window.add(txtPanel);
        window.add(signPanel);
        window.add(btnClear);
        window.add(btnDel);
        window.add(btnNum7);
        window.add(btnNum8);
        window.add(btnNum9);
        window.add(btnNum4);
        window.add(btnNum5);
        window.add(btnNum6);
        window.add(btnNum1);
        window.add(btnNum2);
        window.add(btnNum3);
        window.add(btnScientific);
        window.add(btnNum0);
        window.add(btnDecimalPt);
        window.add(btnPer);
        window.add(btnDiv);
        window.add(btnMul);
        window.add(btnSub);
        window.add(btnSum);
        window.add(btnEqualTo);
        window.add(lblName);

        window.setBackground(Color.gray);
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(520,900);
        window.setVisible(true);
    }

    public void arithmeticOperation(){
        switch (calculation) {
            case 1:
                answer = number + Double.parseDouble(txtPanel.getText());
                txtPanel.setText(Double.toString(answer));
                break;
            case 2:
                answer = number - Double.parseDouble(txtPanel.getText());
                txtPanel.setText(Double.toString(answer));
                break;
            case 3:
                answer = number * Double.parseDouble(txtPanel.getText());
                txtPanel.setText(Double.toString(answer));
                break;
            case 4:
                answer = number / Double.parseDouble(txtPanel.getText());
                txtPanel.setText(Double.toString(answer));
                break;
            case 5:
                answer = number / 100;
                txtPanel.setText(Double.toString(answer));
                break;
        }
        number=answer;
    }
}