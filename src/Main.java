import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        partialString(JOptionPane.showInputDialog("Geben sie einen Text ein!!"));
    }


    public static void partialString(String a)
    {
        if (a.length()<3)
        {
            System.err.println("Du brauchst mehr als 3 Zeichen");
        }
        else {
            System.out.println(a.substring(a.length()/2));
        }

    }
}
