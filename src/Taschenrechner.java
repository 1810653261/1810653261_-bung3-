import javax.swing.*;

public class Taschenrechner {


    public static void Addition() {
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Geben sie eine Zahl ein"));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Geben sie eine Zahl ein, die sie dazu addieren möchten"));
        System.out.println(b + c);
        }

    public static void Subtraktion() {
        Double d = Double.parseDouble(JOptionPane.showInputDialog(null, "Geben sie eine Zahl ein"));
        Double e = Double.parseDouble(JOptionPane.showInputDialog(null, "Geben sie eine Zahl ein, die sie davon subtrahieren möchten"));
        System.out.println(d - e);
        }

    public static void Multiplikation() {
        Double f = Double.parseDouble(JOptionPane.showInputDialog(null, "Geben sie eine Zahl ein"));
        Double g = Double.parseDouble(JOptionPane.showInputDialog(null, "Geben sie eine Zahl ein, die sie damit multiplizieren möchten"));
        System.out.println(f * g);
        }

    public static void Division() {
        Double h = Double.parseDouble(JOptionPane.showInputDialog(null, "Geben sie eine Zahl ein"));
        Double i = Double.parseDouble(JOptionPane.showInputDialog(null, "Geben sie eine Zahl ein, die sie davon dividieren möchten"));
        System.out.println(h / i);
        }
}