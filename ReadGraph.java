import javax.swing.JOptionPane;

public class ReadGraph {
  public static void main(String[] args) {

    // Simple form of showInputDialog...
    String s = JOptionPane.showInputDialog(null, "Enter an integer");

    // Parsing string to get an int
    int k = Integer.parseInt(s);

    // Parsing string to get a double
    s = JOptionPane.showInputDialog(null, "Enter a double");
    double x = Double.parseDouble(s);

    s = JOptionPane.showInputDialog(null, "Enter a string (spaces OK)");

    JOptionPane.showMessageDialog(null,
                                 "Data entered: int=" + k + ", double=" +
                                 x + ", string=\"" + s + "\"");

    System.exit(0); // Terminates the program
  }
}