public class Car extends Technic {

    private String brand;
    private String equipment;


    public Car(int power, String brand, String equipment) {
        super(power);
        this.brand = brand;
        this.equipment = equipment;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void accelerationTo100(){
        System.out.println("Acceleration to 100 2.7 Km/h");
    }
    public void price(){
        System.out.println("Price 125543 USD");
    }

    @Override
    public String toString() {
        return "Nissan" +
                "\nBrand: " + brand +
                "\nEquipment: " + equipment +
                  super.toString();
    }
}
