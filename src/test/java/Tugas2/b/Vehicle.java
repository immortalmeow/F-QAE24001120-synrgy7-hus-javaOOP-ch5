package Tugas2.b;

public class Vehicle {
    // Atribut
    private int wheels;
    private String name;

    // Constructor
    public Vehicle(int wheels, String name) {
        this.wheels = wheels;
        this.name = name;
    }

    // Method untuk bergerak maju
    public void moveForward() {
        System.out.println(name + " bergerak maju.");
    }

    // Method untuk berbelok
    public void turn(String direction) {
        System.out.println(name + " berbelok ke " + direction + ".");
    }

    // Method untuk berhenti
    public void stop() {
        System.out.println(name + " berhenti.");
    }

    // Getter dan Setter
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

