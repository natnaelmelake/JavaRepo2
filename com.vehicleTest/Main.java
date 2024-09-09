public class Main {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.setSpeed(50);
        System.out.println(c1.getSpeedMph());


        ElectricCar Ec1=new ElectricCar();
        Ec1.setBatteryLevel(10);
        Ec1.drive(50);

        System.out.println(Ec1.getBatteryLevel());
    }
}
