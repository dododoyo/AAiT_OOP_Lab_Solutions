import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class simpleCalculator extends JFrame
{
    //Intitallizing the components needed for calculator

    private JPanel panelForOutput;
    private JPanel panelForUserInputs;
    private JPanel panelForCalculationOutputs;
    private JPanel panelForButtons;

    private JLabel labelForOutput;
    
    private JButton buttonOfMultiplication;
    private JButton buttonOfSubtraction;
    private JButton buttonOfAddition;
    private JButton buttonOfdivision;

    private JTextField fieldForInput1;
    private JTextField fieldForInput2;

    simpleCalculator()
    {
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new GridLayout(2,0));
        setLocation(100,100);

        panelForUserInputs = new JPanel();
        panelForUserInputs.setLayout(new GridLayout(1,2));

        panelForCalculationOutputs = new JPanel();

        panelForOutput = new JPanel();
        panelForOutput.setBounds(0,0,300,150);
        panelForOutput.setLayout(new GridLayout(2,1));

        fieldForInput1 = new JTextField("Input 1");
        fieldForInput1.setBounds(10,10,50,20);

        fieldForInput2 = new JTextField("Input 2");
        fieldForInput2.setBounds(110,10,50,20);

        labelForOutput = new JLabel();
        labelForOutput.setBounds(50,50,100,50);
        labelForOutput.setText("Output");


        panelForButtons = new JPanel();
        panelForButtons.setBounds(100,100,200,100);
        panelForButtons.setLayout(new GridLayout(2,2,60,10));

        buttonOfAddition = new JButton("+");
        buttonOfAddition.setSize(70, 20);
        buttonOfAddition.addActionListener(new eventListener());

        buttonOfSubtraction = new JButton("-");
        buttonOfSubtraction.setSize(70, 20);
        buttonOfSubtraction.addActionListener(new eventListener());

        buttonOfMultiplication = new JButton("*");
        buttonOfMultiplication.setSize(70, 20);
        buttonOfMultiplication.addActionListener(new eventListener());

        buttonOfdivision = new JButton("/");
        buttonOfdivision.setSize(70, 20);
        buttonOfdivision.addActionListener(new eventListener());

        panelForButtons.add(buttonOfAddition);
        panelForButtons.add(buttonOfSubtraction);
        panelForButtons.add(buttonOfMultiplication);
        panelForButtons.add(buttonOfdivision);

        panelForUserInputs.add(fieldForInput1);
        panelForUserInputs.add(fieldForInput2);

        panelForCalculationOutputs.add(labelForOutput);

        panelForOutput.add(panelForUserInputs);
        panelForOutput.add(panelForCalculationOutputs);

        getContentPane().add(panelForOutput);
        getContentPane().add(panelForButtons);
        setVisible(true);

       

    }

    private class eventListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == buttonOfAddition)
            labelForOutput.setText(""+((Double.parseDouble(fieldForInput1.getText()))+(Double.parseDouble(fieldForInput2.getText()))));

            if(e.getSource() == buttonOfSubtraction)
            labelForOutput.setText(""+((Double.parseDouble(fieldForInput1.getText()))-(Double.parseDouble(fieldForInput2.getText()))));

            if(e.getSource() == buttonOfMultiplication)
            labelForOutput.setText(""+((Double.parseDouble(fieldForInput1.getText()))*(Double.parseDouble(fieldForInput2.getText()))));

            if(e.getSource() == buttonOfdivision)
            labelForOutput.setText(""+((Double.parseDouble(fieldForInput1.getText()))/(Double.parseDouble(fieldForInput2.getText()))));

        }

    }

    public static void main(String[] args)
    {
        new simpleCalculator();
    }


}