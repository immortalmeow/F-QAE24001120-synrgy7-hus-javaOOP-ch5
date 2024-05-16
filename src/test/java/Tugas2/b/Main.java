package Tugas2.b;

public class Main {
    public static void main(String[] args) {
        ToyotaSupra toyotaSupra = new ToyotaSupra(60.0, "Manual");
        MazdaMiata mazdaMiata = new MazdaMiata(50.0, "Automatic");
        Porsche911 porsche911 = new Porsche911(70.0, "Automatic");

        // Toyota Supra
        toyotaSupra.moveForward();
        toyotaSupra.turn("kiri");
        toyotaSupra.stop();

        // Mazda Miata
        mazdaMiata.moveForward();
        mazdaMiata.turn("kanan");
        mazdaMiata.stop();

        // Porsche 911
        porsche911.moveForward();
        porsche911.turn("kiri");
        porsche911.stop();
    }
}

