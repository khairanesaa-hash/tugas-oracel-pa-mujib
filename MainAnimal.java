public class MainAnimal {
    public static void main(String[] args) {
        // Menggunakan constructor pertama (Default)
        Animal animal1 = new Animal();
        
        // Menggunakan constructor kedua (Parameterized)
        Animal animal2 = new Animal(60, 5, 15);

        // Mencetak kecepatan menggunakan method getter
        System.out.println("a. Animal #1 memiliki kecepatan " + animal1.getSpeed() + ".");
        System.out.println("b. Animal #2 memiliki kecepatan " + animal2.getSpeed() + ".");
    }
}