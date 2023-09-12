# Laboratory Exercises #9

[All Exercises](../README.md)

[<< Laboratory Exercise 08](../Lab_08/readMeLab08.md) | [Laboratory Exercise 10 >>](../Lab_10/readMeLab10.md)

## Objective

- Introducing the basics of Graphical User Interface(GUI) programming using Java programming language.
- 
## Preparation Tasks
- Understanding the basic concepts of graphical user interfaces that is dealt at the lecture time.

## Activities

#### a. Develop a Java GUI application that displays an empty window that has a size of 300 pixel by 300 pixel and has a background color red.
- Add a label to the previous window that you develop in step one to display the text “Hello Guys from
GUI App.!”
- In Addition to the label, add a button control to your GUI application.

[Solution File](./LAB09A/FirstGUI.java)
> Solution Code
```Java
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
```

#### b. Develop a simple Java GUI application called click counter that displays how many times a button is clicked to the console Screen. For instance, if the button is clicked once, the program shall “You clicked me 1 time!” and if the button is clicked two times, the program shall display “You clicked me 2 times!”. . .

[Solution File](./LAB09B/clickCounter.java)
> Solution Code
```Java
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
```

#### c. Modify the above program to display the above button click message on a label rather than at the console screen;

[Solution File](./LAB09C/clickCounter2.java)
> Solution Code
```Java
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
```

#### d. Develop a Java swing application that takes two numbers from the user using two text fields and displays their sum, product, difference and division on a label. The user preference of the four options shall be taken by two options: one by separate button for each operations and one by using combo box. Both options shall be fully implemented and be fully functional.

[Solution File](./LAB09D/simpleCalculator.java)
> Solution Code
```Java
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
```

#### e. Develop GUI based application for the fraction class that you implemented to demonstrate the abstract data types in your previous laboratory exercise.

[Solution File](./LAB09E/FractionGUI.java)
> Solution Code
```Java
import javax.swing.JFrame;

public class FractionGUI extends JFrame
{
    // To be created 
}

```

#### f. Develop a simple calculator using Java Swing GUI application. The functionality requirement of the application shall be as your preference but it must have at least the basic functionality expected from common simple calculators but you are free to use your own preference with regard to graphics and related implementations.

[Solution File](./LAB09F/ModifiedCalculator.java)
> Solution Code
```Java
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;

public class ModifiedCalculator extends JFrame
{
    //variables to store the numbers ditacted
    private double firstNumber;
    private double secondNumber;

    //string variables to store numbers ditacted
    private String firstNum="";

    //variable to store the result of our calculation
    private double result=0;

    // variable to detect operation performed
    private char operation;


    private JPanel outputPanel;//Panel to show the output
    private JPanel NumbersPanel;//Panel to store the numbers
    private JPanel operationPanel;//Panel to store the operation signs

    private JButton buttonOfOne;
    private JButton buttonOfTwo;
    private JButton buttonOfThree;
    private JButton buttonOfFour;
    private JButton buttonOfFive;
    private JButton buttonOfSix;
    private JButton buttonOfSeven;
    private JButton buttonOfEight;
    private JButton buttonOfNine;
    private JButton buttonOfZero;
    private JButton buttonOfPoint;
    // Created the buttons for numbers

    private JButton buttonOfAddition;
    private JButton buttonOfSubtraction;
    private JButton buttonOfMultiplication;
    private JButton buttonOfDivision;
    private JButton buttonToShowSolution;
    private JButton buttonForClear;
    // Created the buttons for the maths operators

    //Label field for the output
    private JLabel fieldForOutput;

    public static void main(String[] args)
    {
        // We don't plan to make any changes to our calculator so we can just make anonymous object of calculator
        new ModifiedCalculator();
    }

    public ModifiedCalculator()
    {
        super("Personal Calculator"); //using constructor to set title for the frame.
        Container calculatorContents = getContentPane();
        setTitle("CASIO Calculator"); // Taking the famous brand's name for marketing
        setSize(315, 550); // Sets the size of the calculator frame.
        setResizable(false);//because components are sized optimally to this size better if not resized by user
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of calculator when closed.
        setBackground(Color.BLACK);
        setLayout(null); //we will manually place our components
        setLocation(300,200);
        
        fieldForOutput = new JLabel();
        //Increasing default size and change the font into more readable form
        fieldForOutput.setFont(new Font("Serif",Font.BOLD,40));

        operationPanel = new JPanel();
        operationPanel.setBackground(Color.BLUE);
        operationPanel.setLayout(new GridLayout(5,1,3,3));
        operationPanel.setBounds(225,110,75,400);

        NumbersPanel = new JPanel();
        NumbersPanel.setBackground(Color.RED);
        NumbersPanel.setLayout(new GridLayout(4,3,5,5));
        NumbersPanel.setBounds(0,110,225,400);

        outputPanel = new JPanel();
        outputPanel.setBackground(Color.GRAY);
        outputPanel.setBounds(0,0,300,100);
        outputPanel.setLayout(new FlowLayout());
        outputPanel.add(fieldForOutput);

        //Create the buttons with their text
        buttonOfZero = new JButton("0");
        buttonOfOne = new JButton("1");
        buttonOfTwo = new JButton("2");
        buttonOfThree = new JButton("3");
        buttonOfFour = new JButton("4");
        buttonOfFive = new JButton("5");
        buttonOfSix = new JButton("6");
        buttonOfSeven = new JButton("7");
        buttonOfEight = new JButton("8");
        buttonOfNine = new JButton("9");
        buttonOfPoint = new JButton(".");
        buttonToShowSolution = new JButton("=");

        buttonOfAddition = new JButton("+");
        buttonOfMultiplication = new JButton("x");
        buttonOfSubtraction = new JButton("-");
        buttonOfDivision = new JButton("/");
        buttonForClear = new JButton("C");

        //let's add the buttons to their respective panel
        NumbersPanel.add(buttonOfNine);
        NumbersPanel.add(buttonOfEight);
        NumbersPanel.add(buttonOfSeven);
        NumbersPanel.add(buttonOfSix);
        NumbersPanel.add(buttonOfFive);
        NumbersPanel.add(buttonOfFour);
        NumbersPanel.add(buttonOfThree);
        NumbersPanel.add(buttonOfTwo);
        NumbersPanel.add(buttonOfOne);
        NumbersPanel.add(buttonOfPoint);
        NumbersPanel.add(buttonOfZero);
        NumbersPanel.add(buttonToShowSolution);

        operationPanel.add(buttonOfAddition);
        operationPanel.add(buttonOfSubtraction);
        operationPanel.add(buttonOfMultiplication);
        operationPanel.add(buttonOfDivision);
        operationPanel.add(buttonForClear);

        //Link the buttons with the action listener
        buttonOfAddition.addActionListener(new eventListener());
        buttonOfMultiplication.addActionListener(new eventListener());
        buttonOfSubtraction.addActionListener(new eventListener());
        buttonOfDivision.addActionListener(new eventListener());
        buttonOfPoint.addActionListener(new eventListener());
        buttonToShowSolution.addActionListener(new eventListener());
        buttonForClear.addActionListener(new eventListener());
        buttonOfOne.addActionListener(new eventListener());
        buttonOfTwo.addActionListener(new eventListener());
        buttonOfThree.addActionListener(new eventListener());
        buttonOfFour.addActionListener(new eventListener());
        buttonOfFive.addActionListener(new eventListener());
        buttonOfSix.addActionListener(new eventListener());
        buttonOfSeven.addActionListener(new eventListener());
        buttonOfEight.addActionListener(new eventListener());
        buttonOfNine.addActionListener(new eventListener());
        buttonOfZero.addActionListener(new eventListener());

        calculatorContents.add(outputPanel); //add the output panel to the frame
        calculatorContents.add(NumbersPanel);//add the numbers panel to the frame
        calculatorContents.add(operationPanel);//add the operations panel to the frame
        setVisible(true); //makes the frame visible
    
    }

    private class eventListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            // If the 'C' button is clicked (which stands for clear) the whole output panel is cleared
            if(e.getSource() == buttonForClear)
            {
                firstNum = "";
                fieldForOutput.setText(firstNum);

            }

            // If the buttons for the numbers are clicked respective value will be recorded on the output panel
            if(e.getSource() == buttonOfZero)  
            {
                firstNum = firstNum.concat("0");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfOne)  
            {
                firstNum = firstNum.concat("1");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfTwo)  
            {
                firstNum = firstNum.concat("2");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfThree)  
            {
                firstNum = firstNum.concat("3");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfFour)  
            {
                firstNum = firstNum.concat("4");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfFive)  
            {
                firstNum = firstNum.concat("5");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfSix)  
            {
                firstNum = firstNum.concat("6");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfSeven)  
            {
                firstNum = firstNum.concat("7");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfEight)  
            {
                firstNum = firstNum.concat("8");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfNine)  
            {
                firstNum = firstNum.concat("9");
                fieldForOutput.setText(firstNum);
            }  
            if(e.getSource() == buttonOfPoint)  
            {
                if(!firstNum.contains("."))
                {
                    firstNum = firstNum.concat(".");
                    fieldForOutput.setText(firstNum);
                }
            }  

            // If one of the operation's button is clicked, the whole text before click of operation will be recorded
            // and the input field will be set to empty string so the next number could be recored.
            if(e.getSource() == buttonOfAddition)
            {
                firstNumber = Double.parseDouble(firstNum);
                firstNum = "";
                operation = '+';
            }

            if(e.getSource() == buttonOfSubtraction)
            {
                firstNumber = Double.parseDouble(firstNum);
                firstNum = "";
                operation = '-';
            }

            if(e.getSource() == buttonOfDivision)
            {
                firstNumber = Double.parseDouble(firstNum);
                firstNum = "";
                operation = '/';
            }

            if(e.getSource() == buttonOfMultiplication)
            {
                firstNumber = Double.parseDouble(firstNum);
                firstNum = "";
                operation = '*';
            }


            // If the equal sign is clicked then the second number will be the input after the first number
            // and the result will be displayed with respect to operation recorded
            if(e.getSource()== buttonToShowSolution)
            {
                secondNumber = Double.parseDouble(firstNum);

                if(operation == '+')
                result = firstNumber+secondNumber;
                else if(operation == '-')
                result = firstNumber+secondNumber;
                else if(operation == '/')
                result = firstNumber/secondNumber;
                else if(operation == '*')
                result = firstNumber*secondNumber;

                fieldForOutput.setText(""+result);
                firstNum = "";

            } 
        }
    }
}
```

---

<center>

### Feel free to report any typos or bugs on [dododoyo](https://github.com/dododoyo)

<img alt='Happy-Coding' src="https://readme-typing-svg.herokuapp.com?font=Architects+Daughter&amp;color=red&amp;size=20&amp;lines=Happy+Coding+!+🧑‍💻+ 👨‍💻" style="width: 100%;margin-left:25%"></img>

## Made With 🖤 By  [🐬](https://github.com/dododoyo)

</center>

---