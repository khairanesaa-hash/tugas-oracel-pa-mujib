package vehicles;

public class Vehicle {
    // Nomor 1.b: Static Variables
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // Nomor 1.b: Instance Variables
    private String chassisNo;
    private String model;

    // Nomor 1.b: Constructor
    public Vehicle(String model) {
        numVehicles++; // Inkremen static variable
        this.chassisNo = "ch" + numVehicles; // Gabungan "ch" + numVehicles
        this.model = model; // Menggunakan keyword 'this'
        System.out.println("Vehicle manufactured");
    }

    // Nomor 1.b: Getter dan Setter untuk instance variables
    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Nomor 2.a: Setter untuk static variable MAKE
    public static void setMake(String make) {
        MAKE = make;
    }

    // Nomor 1.k & Nomor 3.g: Method toString()
    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE + "\n" +
               "The model type is " + model + "\n" +
               "The chassis number is " + chassisNo + "\n" +
               "Engine Make: " + Engine.getMAKE() + "\n" +
               "Engine Capacity: " + Engine.getCAPACITY() + "cc";
    }

    // Nomor 3 & Nomor 4: Inner Static Class Engine
    public static class Engine extends Vehicle {
        // Nomor 3.c & 3.d: Static final variables
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        // Nomor 4.b & 4.c: Constructor yang mengirimkan model ke super constructor
        public Engine(String model) {
            super(model);
        }

        // Nomor 3.f: Public static getters
        public static String getMAKE() {
            return MAKE;
        }

        public static int getCAPACITY() {
            return CAPACITY;
        }
    }
}