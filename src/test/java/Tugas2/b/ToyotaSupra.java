package Tugas2.b;

public class ToyotaSupra extends Car {

    public ToyotaSupra(double fuelCapacity, String transmissionType) {
        super("Toyota Supra", fuelCapacity, transmissionType);
    }

    @Override
    public void moveForward() {
        System.out.println(getName() + " bergerak maju secepat kilat.");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " berhenti dengan sempurna.");
    }
}

