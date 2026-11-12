public class Shape {
    private int numSides;
    private boolean regular;

    // Constructor 1: Default
    public Shape() {
        this.numSides = 3;
        this.regular = true;
    }

    // Constructor 2: Parameterized
    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Getter & Setter
    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}