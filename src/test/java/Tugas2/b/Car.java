package Tugas2.b;

public class Car extends Vehicle {
    // Atribut
    private double fuelCapacity;
    private String transmissionType;

    // Constructor
    public Car(String name, double fuelCapacity, String transmissionType) {
        super(4, name); // Semua mobil memiliki 4 roda
        this.fuelCapacity = fuelCapacity;
        this.transmissionType = transmissionType;
    }

    // Method untuk mengubah transmisi
    public void changeTransmission(String newTransmission) {
        this.transmissionType = newTransmission;
        System.out.println(getName() + " mengubah transmisi ke " + newTransmission + ".");
    }

    // Getter dan Setter
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
}
