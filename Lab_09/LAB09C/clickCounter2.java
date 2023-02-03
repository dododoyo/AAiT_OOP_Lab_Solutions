import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class clickCounter2 extends JFrame
{
    private int clickCounter;

    private JButton theButton;
    
    private JPanel panelForOutput;
    private JPanel panelForButton;
    private JLabel labelForOutput;

    //Adding another button for curiosity
    private JButton anotherButton;
    

    public clickCounter2()
    {
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container thisFrame = getContentPane();
        panelForOutput = new JPanel();
        panelForOutput.setBounds(0,0,300,150);


        panelForButton = new JPanel();
        panelForButton.setBounds(0,150,150,150);

        labelForOutput = new JLabel();
        labelForOutput.setText("You clicked me "+(clickCounter)+" time.");

        theButton = new JButton();
        theButton.setText("Click Me");
        theButton.addActionListener(new eventListener());

        anotherButton = new JButton();
        anotherButton.setText("Unclick Me");
        anotherButton.addActionListener(new eventListener());
        
       
        panelForButton.add(theButton);
        panelForButton.add(anotherButton);
        panelForOutput.add(labelForOutput);

        thisFrame.add(panelForButton);
        thisFrame.add(panelForOutput);
        setVisible(true);
    }

    private class eventListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == theButton)
            labelForOutput.setText("You clicked me "+(++clickCounter)+" times.");

            if((e.getSource() == anotherButton) && clickCounter>=0)
            labelForOutput.setText("You clicked me "+(--clickCounter)+" times.");

            if((e.getSource() == anotherButton) && clickCounter<0)
            labelForOutput.setText("Can't unclick me if i am not clicked.");
        }

    }

    public static void main(String[] args)
    {
        new clickCounter2();
    }

}