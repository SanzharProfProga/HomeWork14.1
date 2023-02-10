public class Main {
    public static void main(String[] args)
    {
        Car nissan = new Car(600,"Nissan","Nismo");
        System.out.println(nissan.toString());
        nissan.price();
        nissan.accelerationTo100();
        nissan.start();

    }
}