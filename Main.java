import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// GUI Input Form for your class
// Copy your class into MyClass.java
// Add JLabels and JTextfields for your class attributes

public class Main {
    public static void main(String[] args) {
        // A JFrame is a window where we can design our UI
        JFrame frame = new JFrame("Input Form");
        frame.setSize(500, 500);
        // in FlowLayout, objects will be added in order
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        // create Labels, TextFields, Buttons
        JLabel firstNameLabel = new JLabel("Enter first name");
        JTextField firstNameField = new JTextField(10); // size = 10
        JLabel lastNameLabel = new JLabel("Enter last name");
        JTextField lastNameField = new JTextField(10);

        JButton enterButton = new JButton("Enter");
        JLabel outputLabel = new JLabel();

        // add components to JFrame in this order
        frame.add(firstNameLabel);
        frame.add(firstNameField);
        frame.add(lastNameLabel);
        frame.add(lastNameField);
        frame.add(enterButton);
        frame.add(outputLabel);

        // add event listener for button click.
        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Create an object of your class with the form inputs
                MyClass c = new MyClass(firstNameField.getText(),
                        lastNameField.getText() );
                // print out in label using c.toString()
                outputLabel.setText("You entered: "
                        + c);


            }}); // end of actionListener

        // make the frame visible
        frame.setVisible(true);
    }
}