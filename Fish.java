public class Fish {
    // Nomor 1: Instance variable
    String typeOfFish;
    int friendliness;

    // Nomor 2: Constructor tanpa argumen (default)
    public Fish() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    // Nomor 3: Constructor dengan parameter
    public Fish(String t, int f) {
        this.typeOfFish = t;
        this.friendliness = f;
    }

    // Nomor 5: Method getFriendliness()
    public int getFriendliness() {
        return this.friendliness;
    }

    // Tambahan method helper untuk menampilkan info ikan (opsional untuk pengujian)
    public String toString() {
        return typeOfFish + " (Keramahan: " + friendliness + ")";
    }
}