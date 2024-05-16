package Tugas2.b;

public class MazdaMiata extends Car {

    public MazdaMiata(double fuelCapacity, String transmissionType) {
        super("Mazda Miata", fuelCapacity, transmissionType);
    }

    @Override
    public void moveForward() {
        System.out.println(getName() + " bergerak maju dengan sangat cepat.");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " berhenti dengan sempurna ");
    }
}

