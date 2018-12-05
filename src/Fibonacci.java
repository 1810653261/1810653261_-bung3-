import javax.swing.*;

public class Fibonacci {

    public static void main(String [] args){
        System.out.println(Fibonacci(Integer.parseInt(JOptionPane.showInputDialog("Gib eine Zahl ein"))));
        System.out.println(Fibonacci_Iterativ(Integer.parseInt(JOptionPane.showInputDialog("Gib eine Zahl ein"))));
    }

    public static  int Fibonacci (int Eingabe)
    {
        if(Eingabe<=0) {  //Beide if methoden um bei negative Zahlen null und eins das bereits bekannte Ergebenis folgt und wenn nötig der fibonacci-Algorithmus gestartet wird
            return 0;
        }
        if(Eingabe==1) {
            return 1;
        }
        return Fibonacci(-2) + Fibonacci(-1);
    }
    public static int Fibonacci_Iterativ(int Eingabe) {
        int prev = -1, next = 1, result = 0;
        for (int i = 0; i <= Eingabe; i++) ;
        {
            result = prev + next;
            prev = next;
            next = result;
        }
        return result;
    }
}

