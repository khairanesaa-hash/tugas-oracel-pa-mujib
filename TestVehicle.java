package vehicles;

public class TestVehicle {
    public static void main(String[] args) {
        // Nomor 1.c: Menampilkan informasi awal sebelum membuat object
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        // Nomor 1.f & 1.i: Membuat object vehicle1
        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println(vehicle1.toString());
        System.out.println(); // Baris baru agar rapi

        // Nomor 1.j: Membuat object vehicle2
        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println(vehicle2.toString());
        System.out.println();

        // Nomor 4.d: Membuat object vehicle3 dari static class Engine
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");

        // Nomor 4.e: Menampilkan output khusus vehicle3
        System.out.println("Vehicle number " + vehicle3.getChassisNo() + 
                           " is a " + vehicle3.getModel() + 
                           " model and has an engine capacity of " + 
                           Vehicle.Engine.getCAPACITY() + "cc");
        System.out.println();

        // Nomor 2.a: Mengubah static variable MAKE via vehicle2 (berdampak ke semua instance)
        vehicle2.setMake("Seer");

        // Nomor 1.m: Menampilkan total jumlah kendaraan yang telah diproduksi
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }
}