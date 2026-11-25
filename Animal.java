public class Animal {
    private int speed;
    private int weight;
    private int age;

    // Constructor 1: Default (Tanpa Parameter)
    public Animal() {
        this.speed = 0;
        this.weight = 0;
        this.age = 0;
    }

    // Constructor 2: Parameterized (3 Parameter)
    public Animal(int speed, int weight, int age) {
        this.speed = speed;
        this.weight = weight;
        this.age = age;
    }

    // Method Getter untuk mengambil nilai speed
    public int getSpeed() {
        return speed;
    }
}