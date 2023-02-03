import java.awt.*;
import javax.swing.*;

class FirstGUI extends JFrame
{
    private JLabel firstLabel;
    private JButton firstButton;

    public FirstGUI()
    {
        super("My First GUI.");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        getContentPane().setBackground(Color.RED);
        setBackground(Color.RED);
        setLayout(new FlowLayout());//default layout covers one before it.

        firstLabel = new JLabel();
        firstLabel.setText("Hello Guys from GUI App.");

        firstButton = new JButton();
        firstButton.setText("First Button");

        getContentPane().add(firstLabel);
        getContentPane().add(firstButton);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new FirstGUI();
    }


}