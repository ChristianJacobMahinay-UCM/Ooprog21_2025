import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            // Step 1: Ask user for their name
            String name = JOptionPane.showInputDialog(null, "What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);
            
            // If user presses Cancel or closes the dialog
            if (name == null) {
                JOptionPane.showMessageDialog(null, "You must enter your name to proceed.", "Warning", JOptionPane.WARNING_MESSAGE);
                continue; // Go back to asking for name
            }

            // Step 2: Confirmation dialog
            int choice = JOptionPane.showConfirmDialog(null, 
                    "Do you want your name to be shown?", 
                    "Confirmation", 
                    JOptionPane.YES_NO_CANCEL_OPTION);

            // Step 3: If user chooses YES
            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Message", JOptionPane.INFORMATION_MESSAGE);
                break; // Exit loop after showing name
            } 
            // Step 4: If user chooses NO or CANCEL, loop again
            else if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION) {
                continue; 
            }
        }
    }
}
