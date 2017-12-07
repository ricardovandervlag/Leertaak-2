/* Main class for this application
 @author:   Ricardo van der Vlag
 @version:  2017-12-07
 */
public class Main {
    // Declares a string to be printed
    private String text;
    // Function to set the text
    public void setText(String input){
        text = input;
    }
    // Function to print the text
    public void getText() {
        System.out.println(text);
    }
    // Main function to create an instance of Main.class
    // Function also sets text and prints it
    public static void main(String[] args) {
        Main application = new Main();
        application.setText("Hello Thijs!");
        application.getText();
    }
}