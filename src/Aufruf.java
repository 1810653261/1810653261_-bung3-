public class Aufruf {
    public static void main(String[] args){
        vehicle Fahrzeug= new vehicle(300, 800.9, "´316 Compact");
        vehicle PKW= new vehicle(330, 1600, "M2");

        System.out.println(Fahrzeug.printName());
        System.out.println(PKW.printName());

        Fahrzeug.calculatePower();
        PKW.calculatePower();
    }
}
