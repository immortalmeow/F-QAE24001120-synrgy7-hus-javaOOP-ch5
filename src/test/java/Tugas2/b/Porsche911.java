package Tugas2.b;

public class Porsche911 extends Car {

    public Porsche911(double fuelCapacity, String transmissionType) {
        super("Porsche 911", fuelCapacity, transmissionType);
    }

    @Override
    public void moveForward() {
        System.out.println(getName() + " bergerak maju dengan kecepatan tinggi.");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " berhenti dengan sempurna.");
    }
}

