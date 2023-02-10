public class Technic {
    private int power;

    public Technic(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void start(){
        System.out.println("Starting ");
    }

    @Override
    public String toString() {
        return "\nPower: " + power;
    }
}
