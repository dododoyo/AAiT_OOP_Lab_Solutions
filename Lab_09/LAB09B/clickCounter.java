import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class clickCounter extends JFrame
{
    private int clickCounter;

    private JButton theButton;
   
    private JButton anotherButton;
    

    public clickCounter()
    {
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container thisFrame = getContentPane();
        thisFrame.setLayout(new FlowLayout());
    
        theButton = new JButton();
        theButton.setText("Click Me");
        theButton.addActionListener(new eventListener());

        anotherButton = new JButton();
        anotherButton.setText("Unclick Me");
        anotherButton.addActionListener(new eventListener());
        
        thisFrame.add(theButton);
        thisFrame.add(anotherButton);

        setVisible(true);
    }

    private class eventListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == theButton)
            System.out.println("You clicked me "+(++clickCounter)+" times.");
            if((e.getSource() == anotherButton) && clickCounter>0)
            System.out.println("You clicked me "+(--clickCounter)+" times.");

            if((e.getSource() == anotherButton) && clickCounter<=0)
            System.out.println("Can't unclick me if i am not clicked.");
        }

    }

    public static void main(String[] args)
    {
        new clickCounter();
    }

}