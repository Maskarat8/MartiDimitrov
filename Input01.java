package conko;
import javax.swing.JOptionPane;
public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String name = JOptionPane.showInputDialog(
        		"What is your name?");
        System.out.println(name);
        
        //Parse the input as an int.
        //Print its value +1
        int age = Integer.parseInt(JOptionPane.showInputDialog(
        		"How old are you?"));
        System.out.println(age);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}