public class ElectricCar extends Car {
    private double batteryLevel;

    public ElectricCar(){
        super();
    }

    public void setBatteryLevel(double battery){
        this.batteryLevel=battery;
    }

    public double getBatteryLevel(){
        return batteryLevel;
    }

    public void drive(int distance){
        super.drive(distance);
        this.batteryLevel = this.batteryLevel-(distance*0.01);
    }

}
