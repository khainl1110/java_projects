public class Wheel {
    private int numOfWheels;
    private String make;

    public Wheel() {
    }

    public Wheel(int numOfWheels, String make) {
        this.numOfWheels = numOfWheels;
        this.make = make;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return this.numOfWheels + " and " + this.make;
    }
}
