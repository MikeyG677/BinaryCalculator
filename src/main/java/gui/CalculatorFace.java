package gui;


import logic.InputInterpreter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorFace{

    private BorderLayout layout = new BorderLayout();
    private JPanel mainPanel = new JPanel(layout), verticalTop = new JPanel(new BorderLayout());
    private Box horizontalFunctionTop = Box.createHorizontalBox(),
            functionSide = Box.createVerticalBox(), numPanelLayout = Box.createHorizontalBox();
    private JButton add = new JButton("+"), sub = new JButton("-"), div = new JButton("/"), mul = new JButton("X"),
            sqr = new JButton("^2"), sqrt = new JButton("^.5"), one = new JButton("1"), zero = new JButton("0"),
            equ = new JButton("="), clr = new JButton("clr");
    private JTextArea topDisplay = new JTextArea(1,12), bottomDisplay = new JTextArea(1,12);
    private JFrame frame = new JFrame("Binary Calculator");
    private int buttonWidth = frame.getWidth()/3, heightButton = frame.getHeight()/6;
    private InputInterpreter input = new InputInterpreter();
    private boolean isItEquated = false;

    private void setUpButtonCompunets() {
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input.number1Catch(bottomDisplay.getText());
                input.operandCatch("add");
                topDisplay.setText(topDisplay.getText()+"+");
                bottomDisplay.setText("");
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input.number1Catch(bottomDisplay.getText());
                input.operandCatch("sub");
                topDisplay.setText(topDisplay.getText()+"-");
                bottomDisplay.setText("");
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input.number1Catch(bottomDisplay.getText());
                input.operandCatch("div");
                topDisplay.setText(topDisplay.getText()+"/");
                bottomDisplay.setText("");
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input.number1Catch(bottomDisplay.getText());
                input.operandCatch("mul");
                topDisplay.setText(topDisplay.getText()+"X");
                bottomDisplay.setText("");
            }
        });
        sqr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input.number1Catch(bottomDisplay.getText());
                input.operandCatch("sqr");
                topDisplay.setText("");
                bottomDisplay.setText(input.answerThrower());
            }
        });
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input.number1Catch(bottomDisplay.getText());
                input.operandCatch("sqrt");
                topDisplay.setText(topDisplay.getText()+"+");
                bottomDisplay.setText("");
            }
        });
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                topDisplay.setText("");
                bottomDisplay.setText("");
            }
        });
        equ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input.number2Catch(bottomDisplay.getText());
                topDisplay.setText("");
                bottomDisplay.setText(input.answerThrower());
                isItEquated = true;
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(isItEquated){
                    topDisplay.setText("");
                    bottomDisplay.setText("");
                    isItEquated = false;
                }
                topDisplay.setText(topDisplay.getText()+"1");
                bottomDisplay.setText(bottomDisplay.getText()+"1");
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(isItEquated){
                    topDisplay.setText("");
                    bottomDisplay.setText("");
                    isItEquated = false;
                }
                topDisplay.setText(topDisplay.getText()+"0");
                bottomDisplay.setText(bottomDisplay.getText()+"0");
            }
        });

    }

    private void setupTextDispaly(){
        topDisplay.setVisible(true);
        bottomDisplay.setVisible(true);
        topDisplay.setSize(new Dimension(200,15));
        bottomDisplay.setSize(new Dimension(200,15));
        topDisplay.setEditable(false);
        bottomDisplay.setEditable(false);
    }

    private void setUpFrame(){
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(200,230));
        frame.setBackground(new Color(32,0,128));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void setUpDisplay(){

        horizontalFunctionTop.add(sqrt);
        horizontalFunctionTop.add(sqr);
        horizontalFunctionTop.add(clr);

        verticalTop.add(topDisplay, BorderLayout.NORTH);
        verticalTop.add(bottomDisplay,BorderLayout.CENTER);
        verticalTop.add(horizontalFunctionTop, BorderLayout.SOUTH);
        verticalTop.setBackground(mainPanel.getBackground());

        functionSide.add(div);
        functionSide.add(mul);
        functionSide.add(sub);
        functionSide.add(add);
        functionSide.add(equ);
        functionSide.setBackground(mainPanel.getBackground());

        numPanelLayout.add(zero);
        numPanelLayout.add(one);
        numPanelLayout.setBackground(mainPanel.getBackground());

        mainPanel.add(verticalTop, layout.NORTH);
        mainPanel.add(functionSide, layout.EAST);
        mainPanel.add(numPanelLayout,layout.CENTER);
        mainPanel.setFocusable(true);
        mainPanel.setBackground(frame.getBackground());
    }

    public CalculatorFace(){

        setUpButtonCompunets();
        setupTextDispaly();
        setUpDisplay();
        setUpFrame();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                new CalculatorFace();
            }
        });
    }
}