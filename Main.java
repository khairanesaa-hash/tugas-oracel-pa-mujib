// Class utama (harus sama dengan nama file)
public class Main {
    public static void main(String[] args) {
        Fish amber = new Fish("AngelFish", 5);
        Fish james = new Fish("Guppy", 3);
        
        Fish hasil = Fish.nicestFish(amber, james);
        System.out.println("Ikan paling ramah: " + hasil.typeOfFish);
    }
}

// Class pendukung (tanpa kata public di depannya)
class Fish {
    String typeOfFish;
    int friendliness;

    public Fish() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    public Fish(String t, int f) {
        this.typeOfFish = t;
        this.friendliness = f;
    }

    public int getFriendliness() {
        return this.friendliness;
    }

    public static Fish nicestFish(Fish... fishes) {
        if (fishes.length == 0) return null;
        Fish temp = fishes[0];
        for (int i = 1; i < fishes.length; i++) {
            if (fishes[i].getFriendliness() > temp.getFriendliness()) {
                temp = fishes[i];
            }
        }
        return temp;
    }
}