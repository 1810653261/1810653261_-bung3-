import javax.swing.*;

public class vehicle
{
    int power; //kw
    double weight;//kg
    String name;//name

    public vehicle(int power, double weight, String name)
    {
        this.name = name;
        this.power = power;
        this.weight = weight;
    }
    public String printName()
    {
        return name;
    }
    public void calculatePower(){
        double Pferdestärken = power * 1.36;
        JOptionPane.showMessageDialog(null, Pferdestärken);
    }
}
